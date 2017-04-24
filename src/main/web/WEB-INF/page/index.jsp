<%--suppress ALL --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <link href="<c:url value="/resource/css/style.css" />" rel="stylesheet">

    <script type="text/javascript">
        <%@include file="/resource/js/jquery-1.6.3.min.js"%>
    </script>
    <script type="text/javascript">
        <%@include file="/resource/js/marker.js"%>
    </script>
    <script type="text/javascript">
        <%@include file="/resource/js/JQuery.js"%>
    </script>
    <title> World Map </title>

<audio id="music" autoplay="autoplay" loop="loop">
					<source src="/resource/sound/home2.ogg"/>
</audio>
<script>
var vol=document.getElementById("music");
vol.volume=0.2
</script>

</head>
<body onUnload="window.history.go(1)">
<div class="menu-wrap">
    <nav class="menu">
        <ul class="clearfix">
            <li class="current-item"><a href="/">Home</a></li>
            <li><a href="inventory">Inventory</a></li>
            <li ><a href="/exit">Exit</a></li>
        </ul>
    </nav>
</div>
<div id="wrapper">
    <img width="1450" height="700" src="../../resource/image/FantasyMap(scroll).png" alt="World Map">
    <div class="pin pin-down" data-xpos="1050" data-ypos="330">
        <h2>Barrens</h2>
        <ul>
            <li><b>Levels 10-20</b></li>
            <li>Deserted lands contaminated by evil impact. Not many can survive in these sands. </li>
            <br>
            <li><b><a href="">Embark</a></b></li>

        </ul>
    </div>

    <div class="pin" data-xpos="490" data-ypos="400">
        <h2>Harbor</h2>
        <ul>
            <li><b>Store & Upgrades</b></li>
            <li>Single isle of hope and peace </li>
            <br>
            <li><b><a href="">Enter</a></b></li>

        </ul>
    </div>

    <div class="pin pin-down" data-xpos="400" data-ypos="150">
        <h2>Frozen Hills</h2>
        <ul>
            <li><b>Levels 30-40</b></li>
            <li>Gather your courage. Howling winds and dreadful cold will make you suffer. No one ever escaped from this desolated icy wasteland </li>
            <br>
            <li><b><a href="">Embark</a></b></li>

        </ul>
    </div>

    <div class="pin pin-down" data-xpos="800" data-ypos="170">
        <h2>Boneyard</h2>
        <ul>
            <li><b>Levels 20-30</b></li>
            <li>Tombs, decaying soil and ghoulish creatures will descent you into madness. It's no place for alive. Dead reign here. </li>
            <br>
            <li><b><a href="">Embark</a></b></li>

        </ul>
    </div>

    <div class="pin pin-down" data-xpos="750" data-ypos="400">
        <h2>WoodLand</h2>
        <ul>
            <li><b>Levels 1-10</b></li>
            <li>Glorious Forest with blooming orchards and shaded groves. What threat can you expect? </li>
            <br>
            <li><b><a href="/woodland">Embark</a></b></li>

        </ul>
    </div>

</div>

</body>
</html>