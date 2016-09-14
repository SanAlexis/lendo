<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Example of Bootstrap 3 Accordion</title>
    <link type="text/css" href="assets/css/bootstrap/3.3.5/bootstrap.min.css" rel="stylesheet" property="stylesheet"
          media="all"/>
    <link type="text/css" href="assets/css/bootstrap/3.3.5/bootstrap-theme.min.css" rel="stylesheet"
          property="stylesheet" media="all"/>
    <link type="text/css" href="assets/css/main.css" rel="stylesheet" property="stylesheet" media="all"/>
</head>
<body>
<div id="main-container">
    <div class="landing-container">
        <h1>JavaScript</h1>
        <div class="landing-container-content">
            <h3>Beginnings at Netscape</h3>

            <p>JavaScript was originally developed in 10 days in May 1995 by Brendan Eich, while he was working for
                Netscape
                Communications Corporation. Indeed, while competing with Microsoft for user adoption of web technologies
                and
                platforms, Netscape considered their client-server offering a distributed OS with a portable version of
                Sun
                Microsystems' Java providing an environment in which applets could be run.[citation needed] Because Java
                was
                a competitor of C++ and aimed at professional programmers, Netscape also wanted a lightweight
                interpreted
                language that would complement Java by appealing to nonprofessional programmers, like Microsoft's Visual
                Basic (see JavaScript and Java).</p>

            <h3>Standardization</h3>

            <p>In November 1996, Netscape announced that it had submitted JavaScript to Ecma International for
                consideration
                as an industry standard, and subsequent work resulted in the standardized version named ECMAScript. In
                June
                1997, Ecma International published the first edition of the ECMA-262 specification. In June 1998, some
                modifications were made to adapt it to the ISO/IEC-16262 standard, and the second edition was released.
                The
                third edition of ECMA-262 was published on December 1999.[29]</p>

            <p>Development of the fourth edition of the ECMAScript standard was never completed.[30] The fifth edition
                was
                released in December 2009. The current edition of the ECMAScript standard is 6, released in June
                2015.</p>

            <h3>Later developments</h3>

            <p>JavaScript has become one of the most popular programming languages on the Web. Initially, however, many
                professional programmers denigrated the language because its target audience consisted of Web authors
                and
                other such "amateurs", among other reasons.[32] The advent of Ajax returned JavaScript to the spotlight
                and
                brought more professional programming attention. The result was a proliferation of comprehensive
                frameworks
                and libraries, improved JavaScript programming practices, and increased usage of JavaScript outside Web
                browsers, as seen by the proliferation of server-side JavaScript platforms.</p>
        </div>
    </div>
    <div class="panel-group" id="accordion">
        <div class="panel panel-default">
            <div class="panel-heading" style="z-index: 1000" data-toggle="collapse" data-parent="#accordion"
                 data-target="#collapseZero">
                <h4 class="panel-title">
                    <span class="title horizontal-title">
                        REACT
                    </span>
                    <span class="title vertical-title">
                        <span class="rotate-title-vertical">R</span>
                        <span class="rotate-title-vertical">E</span>
                        <span class="rotate-title-vertical">A</span>
                        <span class="rotate-title-vertical">C</span>
                        <span class="rotate-title-vertical">T</span>
                    </span>
                </h4>
            </div>
            <div id="collapseZero" class="panel-collapse collapse">
                <div class="panel-body">
                    <div class="panel-body-content-container">
                        <h3>Overview</h3>

                        <p>React (sometimes styled React.js or ReactJS) is an open-source JavaScript library for
                            creating user interfaces that aims to address challenges encountered in developing
                            single-page applications. It is maintained by Facebook, Instagram and a community of
                            individual developers and corporations.</p>

                        <p>React is intended to help developers build large applications that use data that changes over
                            time. Its goal is to be simple, declarative and composable. React only handles the user
                            interface in an app; it is considered to only be the view in the model–view–controller (MVC)
                            software pattern, and can be used in conjunction with other JavaScript libraries or larger
                            MVC frameworks such as AngularJS. It can also be used with React-based add-ons that take
                            care of the non-UI parts of building a web application.</p>

                        <p>According to JavaScript analytics service Libscore, React is currently being used on the
                            homepages of Imgur, Bleacher Report, Feedly, Airbnb, SeatGeek, HelloSign, and others.</p>

                        <h3>History</h3>

                        <p>React was created by Jordan Walke, a software engineer at Facebook. He was influenced by XHP,
                            an HTML components framework for PHP.</p>

                        <h3>Features</h3>

                        <p>Rather than re-inventing the wheel, React makes use of a developer's knowledge of JavaScript.
                            For example, to output a component for each item in an array, you can use a vanilla for
                            loop, Array.forEach, or Array.map - rather than a custom "each" construct. This applies to
                            almost everything about React, which can be seen by viewing React's small API.[6]</p>

                        <p>React relies on features already available in JavaScript for most of what it does; this
                            ensures that the React API is as lightweight as possible. This also allows them to inherit
                            ECMAScript updates without large amounts of wrapper code that needs to be updated to match,
                            as with many other frameworks and libraries.</p>
                    </div>
                </div>
            </div>
        </div>
        <div class="panel panel-default">
            <div class="panel-heading" style="z-index: 1000" data-toggle="collapse" data-parent="#accordion"
                 data-target="#collapseOne">
                <h4 class="panel-title">
                    <span class="title horizontal-title">
                        YUI
                    </span>
                    <span class="title vertical-title">
                        <span class="rotate-title-vertical">Y</span>
                        <span class="rotate-title-vertical">U</span>
                        <span class="rotate-title-vertical">I</span>
                    </span>
                </h4>
            </div>
            <div id="collapseOne" class="panel-collapse collapse">
                <div class="panel-body">
                    <div class="panel-body-content-container">
                        <h3>Overview</h3>

                        <p>The Yahoo! User Interface Library (YUI) is a discontinued open-source JavaScript library for
                            building richly interactive web applications using techniques such as Ajax, DHTML, and DOM
                            scripting. YUI includes several core CSS resources. It is available under a BSD License.[2]
                            Development on YUI began in 2005 and Yahoo! properties such as My Yahoo! and the Yahoo!
                            front page began using YUI in the summer of that year. YUI was released for public use in
                            February 2006.[3] It was actively developed by a core team of Yahoo! engineers.</p>

                        <p>In September 2009, Yahoo! released YUI 3, a new version of YUI rebuilt from the ground up to
                            modernize the library and incorporate lessons learned from YUI 2. Among the enhancements are
                            a CSS selector driven engine, like jQuery, for retrieving DOM elements, a greater emphasis
                            on granularity of modules, a smaller seed file that loads other modules when necessary, and
                            a variety of syntactic changes intended to make writing code faster and easier.</p>

                        <p>The YUI Library project at Yahoo! was founded by Thomas Sha and sponsored internally by
                            Yahoo! co-founder Jerry Yang; its principal architects have been Sha, Adam Moore, and Matt
                            Sweeney. The library's developers maintain the YUIBlog; the YUI community discusses the
                            library and implementations in its community forum.</p>

                        <p>On August 29, 2014, it was announced that active development of YUI by Yahoo! would end,
                            citing the evolution of the JavaScript standards, steadily decreasing interest in large
                            JavaScript libraries by developers, and the proliferation of server-side solutions. Future
                            development will be limited to maintenance releases addressing issues which are "absolutely
                            critical to Yahoo properties.</p>

                        <h3>Features</h3>

                        <p>The YUI Library is fully documented on its website; detailed API documentation accompanies
                            the library download. It has six types of components: YUI core, utilities, UI controls, CSS
                            components, developer tools, and build tools.</p>
                    </div>
                </div>
            </div>
        </div>
        <div class="panel panel-default">
            <div class="panel-heading" style="z-index: 1000" data-toggle="collapse" data-parent="#accordion"
                 data-target="#collapseTwo">
                <h4 class="panel-title">
                    <span class="title horizontal-title">
                        BOOTSTRAP
                    </span>
                    <span class="title vertical-title">
                        <span class="rotate-title-vertical">B</span>
                        <span class="rotate-title-vertical">O</span>
                        <span class="rotate-title-vertical">O</span>
                        <span class="rotate-title-vertical">T</span>
                        <span class="rotate-title-vertical">S</span>
                        <span class="rotate-title-vertical">T</span>
                        <span class="rotate-title-vertical">R</span>
                        <span class="rotate-title-vertical">A</span>
                        <span class="rotate-title-vertical">P</span>
                    </span>
                </h4>
            </div>
            <div id="collapseTwo" class="panel-collapse collapse">
                <div class="panel-body">
                    <div class="panel-body-content-container">
                        <h3>Origin</h3>

                        <p>Bootstrap, originally named Twitter Blueprint, was developed by Mark Otto and Jacob Thornton
                            at Twitter as a framework to encourage consistency across internal tools. Before Bootstrap,
                            various libraries were used for interface development, which led to inconsistencies and a
                            high maintenance burden. According to Twitter developer Mark Otto:
                            "A super small group of developers and I got together to design and build a new internal
                            tool and saw an opportunity to do something more. Through that process, we saw ourselves
                            build something much more substantial than another internal tool. Months later, we ended up
                            with an early version of Bootstrap as a way to document and share common design patterns and
                            assets within the company."[3]

                        <p>After a few months of development by a small group, many developers at Twitter began to
                            contribute to the project as a part of Hack Week, a hackathon-style week for the Twitter's
                            development team. It was renamed from Twitter Blueprint to Bootstrap, and released as an
                            open source project on August 19, 2011.[4] It has continued to be maintained by Mark Otto,
                            Jacob Thornton, and a small group of core developers, as well as a large community of
                            contributors.[5]</p>

                        <p>On January 31, 2012, Bootstrap 2 was announced. This release added the twelve-column grid
                            layout and responsive design components, as well as changes to many of the existing
                            components.[6] The Bootstrap 3 release was announced on 19 August, 2013, moving to a mobile
                            first approach and using a flat design.[7]
                            On October 29, 2014, Mark Otto announced Bootstrap 4 is in development.[8] The first alpha
                            version of Bootstrap 4 was deployed on August 19, 2015.</p>

                        <h3>Features</h3>

                        <p>Bootstrap is compatible with the latest versions of the Google Chrome, Firefox, Internet
                            Explorer, Opera, and Safari browsers, although some of these browsers are not supported on
                            all platforms.[10]
                            Since version 2.0 it also supports responsive web design. This means the layout of web pages
                            adjusts dynamically, taking into account the characteristics of the device used (desktop,
                            tablet, mobile phone).</p>

                        <p>Starting with version 3.0, Bootstrap adopted a mobile first design philosophy, emphasizing
                            responsive design by default.
                            The version 4.0 alpha release added Sass and Flexbox support.[11]
                            Bootstrap is open source and available on GitHub.[12] Developers are encouraged to
                            participate in the project and make their own contributions to the platform.</p>
                    </div>
                </div>
            </div>
        </div>
        <div class="panel panel-default">
            <div class="panel-heading" style="z-index: 1000" data-toggle="collapse" data-parent="#accordion"
                 data-target="#collapseThree">
                <h4 class="panel-title">
                    <span class="title horizontal-title">
                        JQUERY
                    </span>
                    <span class="title vertical-title">
                        <span class="rotate-title-vertical">J</span>
                        <span class="rotate-title-vertical">Q</span>
                        <span class="rotate-title-vertical">E</span>
                        <span class="rotate-title-vertical">R</span>
                        <span class="rotate-title-vertical">Y</span>
                    </span>
                </h4>
            </div>
            <!-- Add the 'in' class if you want the first page to be open on startup -->
            <div id="collapseThree" class="panel-collapse collapse">
                <div class="panel-body">
                    <div class="panel-body-content-container">
                        <h3>Overview</h3>

                        <p>jQuery is a cross-platform JavaScript library designed to simplify the client-side scripting
                            of
                            HTML.[2] jQuery is the most popular JavaScript library in use today, with installation on
                            65%
                            of the top 10 million highest-trafficked sites on the Web.[3][4][5]
                            jQuery is free, open-source software licensed under the MIT License.</p>

                        <p>jQuery's syntax is designed to make it easier to navigate a document, select DOM elements,
                            create
                            animations, handle events, and develop Ajax applications. jQuery also provides capabilities
                            for
                            developers to create plug-ins on top of the JavaScript library. This enables developers to
                            create abstractions for low-level interaction and animation, advanced effects and
                            high-level,
                            theme-able widgets. The modular approach to the jQuery library allows the creation of
                            powerful
                            dynamic web pages and web applications.</p>

                        <p>The set of jQuery core features—DOM element selections, traversal and manipulation—enabled by
                            its
                            selector engine (named "Sizzle" from v1.3), created a new "programming style", fusing
                            algorithms
                            and DOM data structures. This style influenced the architecture of other JavaScript
                            frameworks
                            like YUI v3 and Dojo, later stimulating the creation of the standard Selectors API.[6]</p>

                        <h3>jQuery plug-ins</h3>

                        <p>jQuery's architecture allows developers to create plug-in code to extend its function. There
                            are thousands of jQuery plug-ins available on the web[20] that cover a range of functions,
                            such as Ajax helpers, web services, datagrids, dynamic lists, XML and XSLT tools, drag and
                            drop, events, cookie handling, and modal windows.</p>

                        <h3>History</h3>

                        <p>jQuery was originally released in January 2006 at BarCamp NYC by John Resig and was
                            influenced by Dean Edwards' earlier cssQuery library.[26] It is currently maintained by a
                            team of developers led by Timmy Willison (with the jQuery selector engine, Sizzle, being led
                            by Richard Gibson).<br/>
                            As of 2015, jQuery remains the most widely used JavaScript library on the Web. According to
                            JavaScript library analytics service, Libscore, jQuery is in use on over 63% of the top
                            million most popular sites by traffic volume.[5] Notable sites using it include Twitter,
                            LinkedIn, Pinterest, and eBay.</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>


<script type="text/javascript" src="assets/js/jquery/2.1.4/jquery.min.js"></script>
<script type="text/javascript" src="assets/js/bootstrap/3.3.5/bootstrap.min.js"></script>
<script type="text/javascript" src="assets/js/main.js"></script>

</body>
</html>            