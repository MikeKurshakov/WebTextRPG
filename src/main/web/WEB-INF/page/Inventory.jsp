<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <style>
        body {
            font-family: san-sarif, Arial;
            font-size: large;
        }
    </style>
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>
    <link href="<c:url value="/resource/css/inventory.css"/>" rel="stylesheet">
    <script type="text/javascript">
        <%@include file="/resource/js/jquery-1.6.3.min.js"%>
    </script>
    <script type="text/javascript">
        <%@include file="/resource/js/Stats.js"%>
    </script>

    <script type="text/javascript">
        <%@include file="/resource/js/it.js"%>
    </script>

<audio id="music" autoplay="autoplay" loop="loop">
					<source src="/resource/sound/home3.ogg"/>
</audio>
<script>
var vol=document.getElementById("music");
vol.volume=0.2;
</script>

    <title> Inventory </title>
    <div class="menu-wrap">
        <nav class="menu">
            <ul class="clearfix">
                <li><a href="/">Home </a></li>
                <li class="current-item"><a href="#">Inventory</a></li>
                <li><a href="/exit">Exit</a></li>
            </ul>
        </nav>
    </div>
</head>

<body>
<div class="character">
    <div id="Name" style="position: absolute; top:20.5%; left:13%;">
        ${Player.name}
    </div>
    <div id="Class" style="position: absolute; top:25.5%; left:13%;">
        ${type}
    </div>
    <div id="Attack" style="position: absolute; top:33%; left:13%;">
        ${Player.attack}
    </div>
    <div id="Defense" style="position: absolute; top:38%; left:14%;">
        ${Player.defense}
    </div>
    <div id="Health" style="position: absolute; top:47%; left:13%;">
        ${Player.health}
    </div>
    <div id="Mana" style="position: absolute; top:52%; left:13%;">
        ${Player.mana}
    </div>
    <div id="Strength" style="position: absolute; top:65%; left:32%;">
        ${Player.strength}
    </div>
    <div id="Agility" style="position: absolute; top:72.5%; left:32%;">
        ${Player.agility}
    </div>
    <div id="Intelligence" style="position: absolute; top:80.5%; left:32%;">
        ${Player.intelligence}
    </div>
    <div id="Vitality" style="position: absolute; top:89%; left:32%;">
        ${Player.vitality}
    </div>
    <div id="Point" style="position: absolute; top:65%; left:50%;">
        ${Player.point}
    </div>
    <div id="Level" style="position: absolute; top:20.5%; left:49%;">
        ${Player.level}
    </div>
    <div id="Exp" style="position: absolute; top:25.5%; left:49%;">
        ${Player.exp}
    </div>
    <div id="Arrow" style="position: absolute; top:65%; left:36%;">
        <input type="button" id="arrowStrength" value="plus">
    </div>

    <div id="Arrow1" style="position: absolute; top:72.5%; left:36%;">
        <input type="button" id="arrowAgility" value="plus">
    </div>

    <div id="Arrow2" style="position: absolute; top:80.5%; left:36%;">
        <input type="button" id="arrowIntelligence" value="plus">
    </div>

    <div id="Arrow3" style="position: absolute; top:89%; left:36%;">
        <input type="button" id="arrowVitality" value="plus">
    </div>
    <div id="Item" style="position: absolute; top: 20%; left: 60%;">
        <table border="1" id="equipped">
            <tr>
                <td align="center" width="50" height="10">Name</td>
                <td align="center" width="50" height="10">Agility</td>
                <td align="center" width="50" height="10">Strength</td>
                <td align="center" width="50" height="10">Vitality</td>
                <td align="center" width="50" height="10">Intelligence</td>
                <td align="center" width="50" height="10">Price</td>
            </tr>
            <%
                int i = 0;
                request.getSession().setAttribute("i", i);
            %>
            <c:forEach items="${item}" var="item1">
                <tr  style="color: rgba(17,2,5,0.96)">
                    <td hidden><% out.print(i + " equip" + " ");%>${item1.position}</td>
                    <td align="center" height="10" width="50">${item1.name}</td>
                    <td align="center" height="10" width="50">${item1.agility}</td>
                    <td align="center" height="10" width="50">${item1.strength}</td>
                    <td align="center" height="10" width="50">${item1.vitality}</td>
                    <td align="center" height="10" width="50">${item1.intelligence}</td>
                    <td align="center" height="10" width="50">${item1.price}</td>
                    <td><input type="button" value="Abort" onclick="deleteEquipeItem(${item1.id},'${i}','${item1.position}')"></td>
                    <td><input type="button" value="Unequip" onClick="uneqipe(${item1.id},'${i}','${item1.position}')">
                    <% ++i;
                        request.getSession().setAttribute("i", i);%>

                </tr>
            </c:forEach>

            <c:forEach items="${items}" var="item1">
                <tr  style="color: rgba(17,2,5,0.96)">
                    <td hidden><% out.print(i + " unequip" + " ");%>${item1.position}</td>
                    <td align="center" height="10" width="50">${item1.name}</td>
                    <td align="center" height="10" width="50">${item1.agility}</td>
                    <td align="center" height="10" width="50">${item1.strength}</td>
                    <td align="center" height="10" width="50">${item1.vitality}</td>
                    <td align="center" height="10" width="50">${item1.intelligence}</td>
                    <td align="center" height="10" width="50">${item1.price}</td>
                    <td><input type="button" value="Abort" onClick="deletee(${item1.id},'${i}','${item1.position}')"> </td>
                    <td><input type="button" value="Equip" onClick="equip(${item1.id},'${i}','${item1.position}')"> </td>

                    <% ++i;
                        request.getSession().setAttribute("i", i);%>

                </tr>
            </c:forEach>
        </table>
    </div>


</div>

</body>
</html>
