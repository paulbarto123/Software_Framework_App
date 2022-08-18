package com.example.list_kotlin_app

object HeroesData {
    private val heroNames = arrayOf(
        "Spring Framework",
        "Grails",
        "Code Igniter",
        "Ionic",
        "Laravel",
        "Flutter",
        "Angular Js",
        "React Native",
        "Vue js",
        "Xamarin"
    )

    private val release_date = arrayOf(
        "1 October 2002",
        "29 March 2006",
        "28 February 2006",
        "2013",
        "June 2011",
        "May 2017",
        "20 October 2010",
        "30 March 2022",
        "February 2014",
        "May 16, 2011"
    )
    private val programming_language = arrayOf(
        "Java",
        "Java and Groovy",
        "PHP",
        "TypeScript, JavaScript",
        "PHP",
        "C, C++, Dart",
        "JavaScript",
        "JavaScript, Java, C++, Objective-C, Python",
        "TypeScript",
        "C#"
    )

    private val developers = arrayOf(
        "VMWare",
        "Graeme Rocher, Burt Beckwith, Peter Ledbrook",
        "British Columbia Institute of Technology (2014-2019), CodeIgniter Foundation (2019-now)",
        "Drifty",
        "Taylor Otwell",
        "Google and community",
        "Google",
        "Facebook and community",
        "Evan You",
        "Miguel de Icaza, Nat Friedman"
    )

    private val heroDetails = arrayOf(
        "The first version was written by Rod Johnson, who released the framework with the publication of his book Expert One-on-One J2EE Design and Development in October 2002. The framework was first released under the Apache 2.0 license in June 2003. The first production release, 1.0, was released in March 2004. The Spring 1.2.6 framework won a Jolt productivity award and a JAX Innovation Award in 2006. Spring 2.0 was released in October 2006, Spring 2.5 in November 2007, Spring 3.0 in December 2009, Spring 3.1 in December 2011, and Spring 3.2.5 in November 2013. Spring Framework 4.0 was released in December 2013. Notable improvements in Spring 4.0 included support for Java SE (Standard Edition) 8, Groovy 2, some aspects of Java EE 7, and WebSocket.Spring Boot 1.0 was released in April 2014.Spring Framework 4.2.0 was released on 31 July 2015 and was immediately upgraded to version 4.2.1, which was released on 01 Sept 2015. It is \"compatible with Java 6, 7 and 8, with a focus on core refinements and modern web capabilities\".Spring Framework 4.3 has been released on 10 June 2016 and will be supported until 2",
        "Grails is an open source web application framework that uses the Apache Groovy programming language (which is in turn based on the Java platform). It is intended to be a high-productivity framework by following the \"coding by convention\" paradigm, providing a stand-alone development environment and hiding much of the configuration detail from the developer.Grails was previously known as \"Groovy on Rails\"; in March 2006 that name was dropped in response to a request by David Heinemeier Hansson, founder of the Ruby on Rails framework. Work began in July 2005, with the 0.1 release on March 29, 2006, and the 1.0 release announced on February 18, 2008",
        "Codeigniter was first created by EllisLab, a software company based in Santa Barbara California. EllisLab released Codeigniter for the first time on February 28, 2006. It hasn't been developed in a long time. EllisLab finally wants to give the Codeigniter project to someone else. On July 9, 2013, EllisLab was looking for a new owner of Codeigniter. Finally, on October 6, 2014, the development of Codeigniter was continued under the management of the British Columbia Institute of Technology (BCIT). On October 23, 2019, the Codeigniter Foundation took over this project and is no longer under the stewardship of BCIT. Codeigniter Foundation is a non-profit foundation formed for the further development of Codeigniter. The Codeigniter 4 project started with Jim Parry as the project lead.Finally on February 24, 2020 Codeigniter 4 was officially released.",
        "Ionic is a complete open-source SDK for hybrid mobile app development created by Max Lynch, Ben Sperry, and Adam Bradley of Drifty Co. in 2013. The original version was released in 2013 and built on top of AngularJS and Apache Cordova. However, the latest release was re-built as a set of Web Components, allowing the user to choose any user interface framework, such as Angular, React or Vue.js. It also allows the use of Ionic components with no user interface framework at all. Ionic provides tools and services for developing hybrid mobile, desktop, and progressive web apps based on modern web development technologies and practices, using Web technologies like CSS, HTML5, and Sass. In particular, mobile apps can be built with these Web technologies and then distributed through native app stores to be installed on devices by utilizing Cordova or Capacitor.",
        "Laravel was launched in 2011 and has experienced quite an exponential growth. In 2015, Laravel was the most starred framework on Github. Now this framework is becoming one of the most popular in the world. Laravel is end-user focused, which means focusing on clarity and simplicity, both in writing and display, as well as producing web application functionality that works as it should. This allows developers and companies to use this framework to build anything from small projects to high-end enterprise scales. Laravel changes website development to be more elegant, expressive, and fun, according to its jargon “The PHP Framework For Web Artisans”. In addition, Laravel also simplifies the website development process with the help of several excellent features, such as Template Engine, Routing, and Modularity.",
        "The first version of Flutter was known as \"Sky\" and ran on the Android operating system. It was unveiled at the 2015 Dart developer summit with the stated intent of being able to render consistently at 120 frames per second. During the keynote of Google Developer Days in Shanghai in September 2018, Google announced Flutter Release Preview 2, the last major release before Flutter 1.0. On December 4th of that year, Flutter 1.0 was released at the Flutter Live event, denoting the first stable version of the framework. On December 11, 2019, Flutter 1.12 was released at the Flutter Interactive event.On May 6, 2020, the Dart software development kit (SDK) version 2.8 and Flutter 1.17.0 were released, adding support for the Metal API which improves performance on iOS devices by approximately 50%, as well as new Material widgets and network tracking development tools. On March 3, 2021, Google released Flutter 2 during an online Flutter Engage event. This major update brought official support for web-based applications with a new CanvasKit renderer and web specific widgets, early-access desktop application support for Windows, macOS, and Linux and improved Add-to-App APIs. This release also utilized Dart 2.0 that featured sound null-safety, which caused many breaking changes and issues with many external packages; however, the Flutter team included instructions and tools to mitigate these issues.On September 8th, 2021, Dart 2.14 and Flutter 2.5 were released by Google. The update brought improvements to the Android full-screen mode and the latest version of Google's Material Design called Material You. Dart received two new updates, standardizing lint conditions and marking support for Apple Silicon as stable.The current stable channel of Flutter is 3.0.2 and the Dart version is 2.17.3 .",
        "AngularJS is a discontinued free and open-source JavaScript-based web framework for developing single-page applications. It was maintained mainly by Google and a community of individuals and corporations. It aimed to simplify both the development and the testing of such applications by providing a framework for client-side model–view–controller (MVC) and model–view–viewmodel (MVVM) architectures, along with components commonly used in web applications and progressive web applications. AngularJS was used as the frontend of the MEAN stack, that consisted of MongoDB database, Express.js web application server framework, AngularJS itself (or Angular), and Node.js server runtime environment.As of January 1, 2022, Google no longer updates AngularJS to fix security, browser compatibility, or jQuery issues. The Angular team recommends upgrading to Angular (v2+) as the best path forward, but they also provided some other options.",
        "In 2012 Mark Zuckerberg commented, \"The biggest mistake we made as a company was betting too much on HTML as opposed to native\". Using HTML5 for Facebook's mobile version resulted in an unstable application that retrieved data slowly. He promised Facebook would soon deliver a better mobile experience.Inside Facebook, Jordan Walke found a way to generate UI elements for iOS from a background JavaScript thread, which became the basis for the React web framework. They decided to organize an internal Hackathon to perfect this prototype in order to be able to build native apps with this technology.In 2015, after months of development, Facebook released the first version for the React JavaScript Configuration. During a technical talk, Christopher Chedeau explained that Facebook was already using React Native in production for their Group App and their Ads Manager App.",
        "Vue.js (commonly referred to as Vue; pronounced \"view\") is an open-source model–view–viewmodel front end JavaScript framework for building user interfaces and single-page applications. It was created by Evan You, and is maintained by him and the rest of the active core team members.Vue.js features an incrementally adaptable architecture that focuses on declarative rendering and component composition. The core library is focused on the view layer only. Advanced features required for complex applications such as routing, state management and build tooling are offered via officially maintained supporting libraries and packages.Vue.js allows for extending HTML with HTML attributes called directives. The directives offer functionality to HTML applications, and come as either built-in or user defined directives.",
        "On May 16, 2011, Miguel de Icaza announced on his blog that Mono would be developed and supported by Xamarin, a newly formed company that planned to release a new suite of mobile products. According to de Icaza, at least part of the original Mono team had moved to the new company.The name Xamarin comes from the name of the Tamarin monkey, replacing the leading T with an X. This is in line with the naming theme used ever since Ximian was started.After Xamarin was announced, the future of the project was questioned since MonoTouch and Mono for Android would now be in direct competition with the existing commercial offerings owned by Attachmate. It was not known at that time how Xamarin would prove they had not illegally used technologies previously developed when they were employed by Novell for the same work. In July 2011, however, Novell – now a subsidiary of Attachmate – and Xamarin announced that Novell had granted a perpetual license to Xamarin for Mono, MonoTouch and Mono for Android, and Xamarin formally and legally took official stewardship of the project."
    )
    private val heroesImages = intArrayOf(
        R.drawable.spring_java,
        R.drawable.grails,
        R.drawable.code_igniter_framework,
        R.drawable.ionic_ios,
        R.drawable.laravel,
        R.drawable.flutter_framework,
        R.drawable.angular_js,
        R.drawable.react_native,
        R.drawable.vue,
        R.drawable.xamarin)

    val listData: ArrayList<Hero>
        get() {
            val list = arrayListOf<Hero>()
            for (position in heroNames.indices) {
                val hero = Hero()
                hero.name = heroNames[position]
                hero.detail = heroDetails[position]
                hero.photo = heroesImages[position]
                hero.programming_language = programming_language[position]
                hero.developers = developers[position]
                hero.release_date = release_date[position]
                list.add(hero)
            }
            return list
        }
}