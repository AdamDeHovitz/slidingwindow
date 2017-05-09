var showa = false;

$('#suggestionsa').on('click', function() {
    showa = ! showa;
    if (! showa){
        $("#headera")[0].text = "Click for suggestions"
        $("#suggestionsa").attr("size", 0);
    }
    else {
        $("#headera")[0].text = "Click to collapse"
        $("#headera")[0].style.fontWeight = 900;
        $("#suggestionsa").attr('size', 6);
    }
})

$("#linea").on('keyup', function() {
    var select = document.getElementById("suggestionsa");

    var postParameter = {
            	    line: this.value
            }

            	    console.log("-" + this.value + "-");
    $.post("/autocorrect", postParameter, function(responseJSON){
        responseObject = JSON.parse(responseJSON);
        answers = responseObject.answers;
        var i;
        for(i=select.options.length-1;i>0;i--)
        {
            select.remove(i);
        }
        for(var i = 0; i < answers.length; i++) {
            var answer = answers[i];
            var el = document.createElement("option");
            el.textContent = answer;
            el.value = answer;
            select.appendChild(el);
        }
    })
})


var showb = false;

$('#suggestionsb').on('click', function() {
    showb = ! showb;
    if (! showb){
        $("#headerb")[0].text = "Click for suggestions"
        $("#suggestionsb").attr("size", 0);
    }
    else {
        $("#headerb")[0].text = "Click to collapse"
        $("#headerb")[0].style.fontWeight = 900;
        $("#suggestionsb").attr('size', 6);
    }
})

$("#lineb").on('keyup', function() {
    console.log("here")
    var select = document.getElementById("suggestionsb");

    var postParameter = {
            	    line: this.value
            }

            	    console.log("-" + this.value + "-");
    $.post("/autocorrect", postParameter, function(responseJSON){
        responseObject = JSON.parse(responseJSON);
        answers = responseObject.answers;
        var i;
        for(i=select.options.length-1;i>0;i--)
        {
            select.remove(i);
        }
        for(var i = 0; i < answers.length; i++) {
            var answer = answers[i];
            var el = document.createElement("option");
            el.textContent = answer;
            el.value = answer;
            select.appendChild(el);
        }
    })
})