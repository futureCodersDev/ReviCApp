<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Revi-C Revision App</title>

    <asset:link rel="icon" href="fcIcon_v2.ico" type="image/x-ico" />
</head>
<body>
    <content tag="nav">
        <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Subjects <span class="caret"></span></a>
            <ul class="dropdown-menu">
                <li><a href="#">Math</a></li>
                <li><a href="#">English</a></li>
                <li><a href="#">Science</a></li>
                <li><a href="#">History</a></li>
                <li><a href="#">French</a></li>
            </ul>
        </li>
        <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Topics <span class="caret"></span></a>
            <ul class="dropdown-menu">
                <li><a href="#">Algebra</a></li>
                <li><a href="#">Number</a></li>
                <li><a href="#">Shape and measure</a></li>
            </ul>
        </li>
        <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Sub-Topics <span class="caret"></span></a>
            <ul class="dropdown-menu">
                <li><a href="#">Linear equations</a></li>
                <li><a href="#">Simultaneous equations</a></li>
                <li><a href="#">Quadratic equations</a></li>
            </ul>
        </li>
        <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">User Profile <span class="caret"></span></a>
            <ul class="dropdown-menu">
                <li><a href="#">Login</a></li>
                <li><a herf="#">Progress</a></li>
            </ul>
        </li>
    </content>

    <div class="no-svg" role="presentation">
        <div class="grails-logo-container">
            <asset:image src="fcLogo_v2.png" class="grails-logo"/>
        </div>
    </div>

    <div id="content" role="main">
        <section class="row colset-2-its">
            <h1>Welcome to the Revision App - happy revising</h1>

            <p>
                This app will allow you to choose your subjects, topics and sup-topics and then to 
                complete the activities related to that topic. When you are ready you can take 
                a topic test.  Your test scores and your activity progress are stored in your
                user profile.
            </p>

            <div id="controllers" role="navigation">
                <h2>Functionality</h2>
                <ul>
                    <g:each var="c" in="${grailsApplication.controllerClasses.sort { it.fullName } }">
                        <li class="controller">
                            <g:link controller="${c.logicalPropertyName}">${c.fullName}</g:link>
                        </li>
                    </g:each>
                </ul>
            </div>
        </section>
    </div>

</body>
</html>
