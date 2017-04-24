
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <style>
        body {
            background-image: url("/resource/image/sprites/Images/Locations/BattleScenes/woodland.png");
            background-size: cover;
        }
    </style>
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>
    <script type="text/javascript">
        <%@include file="/resource/js/jquery-1.6.3.min.js"%>
    </script>
    <script type="text/javascript">
        <%@include file="/resource/js/battle.js"%>
    </script>
    <title>Battle</title>

<audio id="music" autoplay="autoplay" loop="loop">
					<source src="<c:url value="/resource/sound/battle.ogg"/>"/>
</audio>
<script>
var vol=document.getElementById("music");
vol.volume=0.2;
</script>

</head>
<body >
<div align="center">
    <img src="<c:url value="/resource/image/sprites/Images/Enemies/WoodLand/bear.png"/>"
         height="350" width="350">
</div>

<div style="position:  absolute; top:60% ; left:85%; color:#ff0000">
    <table style=" color: #ff0000;" id="enemy">

        <tr>
            <td style="padding: 20px"> Health</td>
            <td style="padding: 20px" id="health"> ${Bear.health}</td>

        </tr>
        <tr>
            <td style="padding: 20px"> Attack</td>
            <td style="padding: 20px"> ${Bear.attack}</td>

        </tr>
        <tr>
            <td style="padding: 20px"> Defense</td>
            <td style="padding: 20px"> ${Bear.defense}</td>

        </tr>
    </table>
</div>
<div style="position: absolute; top: 60%">
    <table id = "player" style=" color: #4CAF50">

        <tr>
            <td style="padding: 20px"> Health</td>
            <td style="padding: 20px"> ${Player.health}</td>

        </tr>
        <tr>
            <td style="padding: 20px"> Attack</td>
            <td style="padding: 20px"> ${Player.attack}</td>

        </tr>
        <tr>
            <td style="padding: 20px"> Defense</td>
            <td style="padding: 20px"> ${Player.defense}</td>

        </tr>
    </table>
</div>

<div style="position:  absolute; top:20% ; left:25%;">
    <table style=" color: #4CAF50;" >

        <tr>
            <td style="padding: 20px">
                <input type="button" value="Head attack" onclick="headAttack('${Bear.name}')"/>
            </td>

        </tr>
        <tr>
            <td style="padding: 20px">
                <input type="button" value="Body attack" onClick="bodyAttack('${Bear.name}')"/>
            </td>

        </tr>
        <tr>
            <td style="padding: 20px">
                <input type="button" value="Legs attack" onclick="legsAttack('${Bear.name}')"/>
            </td>

        </tr>
    </table>
</div>
</body>
</html>
