<#assign content>




<div id="opener" class="title">
 <br>
<section class="a">
 <h1><center> <font face="Baskerville" size="10"> Bacon!! </font></center></h1>
  </section>
  <br>

</div> <!--opener-->

<center>
<section class="c">

<#if error>
<font color="red">
${errorMessage}
</font> <br>
</#if>

<form class="pure-form pure-form-stacked" method="POST" action="/results">
<div class="pure-control-group">
Find the path between the two <br>


  <input type="text" name = "linea" id="linea" size="20" placeholder="Starting Actor">
<select id="suggestionsa" >
<option id="headera"> Click for suggestions </option>
  </select>


<input type="text" name = "lineb" id="lineb" size="20" placeholder="Ending Actor">
  <select id="suggestionsb" >
  <option id="headerb"> Click for suggestions </option>
    </select>

    <br><font face ="Baskerville">
    <button type = "submit" class="pure-button pure-button-primary" > Get Result </button>
    </div>
</section>
</form>


</center>
</form>


</#assign>
<#include "main.ftl">
