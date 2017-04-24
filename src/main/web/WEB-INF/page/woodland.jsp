<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>

    <link href="<c:url value="/resource/css/locations.css" />" rel="stylesheet">
    <script type="text/javascript">
        <%@include file="/resource/js/jquery-1.6.3.min.js"%>
    </script>
    <script type="text/javascript">
        <%@include file="/resource/js/marker.js"%>
    </script>
    <script type="text/javascript">
        <%@include file="/resource/js/JQuery.js"%>
    </script>
    <title> WoodLand </title>
    <div class="menu-wrap">
        <nav class="menu">
            <ul class="clearfix">
                <li><a href="/">Home</a></li>
                <li><a href="inventory">Inventory</a></li>
                <li><a href="/exit">Exit</a></li>
            </ul>
        </nav>
    </div>
    <style>
        body {
            text-align: center;
            font: 16px Arial, Helvetica;
            background: url("/resource/image/sprites/Images/Locations/WoodLand.png") no-repeat center center fixed;
            -webkit-background-size: cover;
            -moz-background-size: cover;
            -o-background-size: cover;
            background-size: cover;

        }
    </style>
</head>

<body onUnload="window.history.go(1)">
<div id="wrapper">

    <div class="pin " data-xpos="1260" data-ypos="500">
        <h2>Marauder</h2>
        <ul>
            <li><b>Level 5</b></li>
            <li>Enemy description.</li>
            <br>
            <li><b><a>Attack</a></b></li>
        </ul>
    </div>

    <div class="pin" data-xpos="530" data-ypos="505">
        <h2>Werewolf</h2>
        <ul>
            <li><b>Level 5</b></li>
            <li>Enemy description</li>
            <br>
            <li><b><a href="">Attack</a></b></li>
        </ul>
    </div>

    <div class="pin" data-xpos="250" data-ypos="400">
        <h2>Bear</h2>
        <ul>
            <li><b>Level 5</b></li>
            <li>Enemy description</li>
            <br>
            <li><b><a href="/battle/woodland/bear">Attack</a></b></li>
        </ul>
    </div>


</div>

</body>
</html>