<#assign content>




<div id="opener" class="title">
 <br>
<section class="a">
 <h1><center> <font face="Baskerville" size="10"> Bacon Search!! </font></center></h1>
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

<form class="pure-form pure-form-stacked" method="GET" action="/search/actor">
<div class="pure-control-group">
Find Actor
  <input type="text" name = "linea" id="linea" size="20" placeholder="Actor">
<select id="suggestionsa" >
<option id="headera"> Click for suggestions </option>
  </select><font face ="Baskerville">
  <button type = "submit" class="pure-button pure-button-primary" > Search Actor</button>
  </form>
  <br> <br></font>
  <form class="pure-form pure-form-stacked" method="GET" action="/search/movie">
Find Movie
<input type="text" name = "lineb" id="lineb" size="20" placeholder=" Movie">
  <select id="suggestionsb" >
  <option id="headerb"> Click for suggestions </option>
    </select>
    <font face ="Baskerville">
    <button type = "submit" class="pure-button pure-button-primary" > Search Movie </button>
    </font>
    </div>
</section>
</form>


</center>
</form>


</#assign>
<#include "main.ftl">
