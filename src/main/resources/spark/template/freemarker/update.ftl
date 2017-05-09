<#assign content>




<div id="opener" class="title">
 <br>
<section class="a">
 <h1><center> <font face="Baskerville" size="10"> Bacon Update!! </font></center></h1>
  </section>
  <br>

</div> <!--opener-->

<center>
<section class="c">



<form class="pure-form pure-form-stacked" method="GET" action="/update/actor">
<div class="pure-control-group">
Add a new Actor
  <input type="text" name = "linea" id="linea" size="20" placeholder="New Actor">
<select id="suggestionsa" >
<option id="headera"> Click for suggestions </option>
  </select><font face ="Baskerville">
  <button type = "submit" class="pure-button pure-button-primary" > Insert Actor</button>
  </form>
  <br> <br></font>
  <form class="pure-form pure-form-stacked" method="GET" action="/update/movie">
Add a new Movie
<input type="text" name = "lineb" id="lineb" size="20" placeholder="New Movie">
  <select id="suggestionsb" >
  <option id="headerb"> Click for suggestions </option>
    </select>
    <font face ="Baskerville">
    <button type = "submit" class="pure-button pure-button-primary" > Insert Movie </button>
    </font>
    </div>
</section>
</form>


</center>
</form>


</#assign>
<#include "main.ftl">
