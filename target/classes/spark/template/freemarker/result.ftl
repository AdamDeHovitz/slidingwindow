<#assign content>




<div id="opener" class="title">
 <br>
<section class="a">
 <h1><center> <font face="Baskerville" size="10"> Bacon Results!! </font></center></h1>
  </section>
  <br>

</div> <!--opener-->

<center>
<section class="c">

<table class="pure-table">
    <thead>
        <tr>
            <th>#</th>
            <th>Donor</th>
            <th>Recipient</th>
            <th>Movie</th>
        </tr>
    </thead>
<tbody>

<#list results as transaction>
<tr><td> ${transaction_index + 1} </td>
<#list transaction as part>
<#if part_index == 2>
 <td> <a href="/movie/${part}">${part}</a> </td>
 <#else>
<td> <a href="/actor/${part}">${part}</a> </td>
</#if>

</#list>
</tr>
</#list>
</tbody>
</table>
</section>
</form>


</center>
</form>


</#assign>
<#include "main.ftl">
