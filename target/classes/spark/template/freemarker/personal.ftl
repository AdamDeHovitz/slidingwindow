<#assign content>




<div id="opener" >
 <br>
<section class="a">
<center>
 <h1 class="title"><center> <font face="Baskerville" size="10"> ${name} </font></h1>
 <form class="pure-form pure-form-stacked" method="GET" action="/change/${wrType}/${name}">
 <div class="pure-control-group">
 Change Name:
   <input type="text" name = "linea" id="linea" size="20" placeholder="New Name">
 <select id="suggestionsa" >
 <option id="headera"> Click for suggestions </option>
   </select>
 <font face ="Baskerville">
     <button type = "submit" class="pure-button pure-button-primary" > Submit Change </button>
     </form>
     </div>
     </center>
  </section>
  <br>

</div> <!--opener-->
<section class="c">
<center>


<table class="pure-table">
    <thead>
        <tr>
            <th>#</th>
            <th>
            ${wrType}
            </th>
            <th>Delete</th>
        </tr>
    </thead>
<tbody>

<#list results as item>
<tr><td> ${item_index + 1} </td>
<td> <a href="/${wrType}/${item}">${item}</a> </td>
<td> <a href="/delete/${wrType}/${name}/${item}">delete</a></td> </tr>
</#list>
</tbody>
</table>
<br>
<form class="pure-form pure-form-stacked" method="GET" action="/add/${wrType}/${name}">
 <div class="pure-control-group">
 Add new ${wrType}:
   <input type="text" name = "lineb" id="lineb" size="20" placeholder= "New ${wrType}">
 <select id="suggestionsb">
 <option id="headerb"> Click for suggestions </option>
   </select>
 <font face ="Baskerville">
     <button type = "submit" class="pure-button pure-button-primary"> Submit Change </button>


</section>
</div>
     </form>
     </center>

</#assign>
<#include "main.ftl">
