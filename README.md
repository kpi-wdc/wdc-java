# World Data Center

[![Gitter](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/kpi-wdc/wdc-java?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

[![Project name](http://img.shields.io/badge/wdc-java-widgets-blue.svg)](https://github.com/kpi-wdc/wdc-java)
[![Build Status](https://travis-ci.org/kpi-wdc/wdc-java.svg?branch=master)](https://travis-ci.org/kpi-wdc/wdc-java)
[![Coverage Status](https://img.shields.io/coveralls/kpi-wdc/wdc-java.svg)](https://coveralls.io/r/kpi-wdc/wdc-java)
[![Issue Stats](http://issuestats.com/github/kpi-wdc/wdc-java/badge/issue)](http://issuestats.com/github/kpi-wdc/wdc-java)
[![Issue Stats](http://issuestats.com/github/kpi-wdc/wdc-java/badge/pr)](http://issuestats.com/github/kpi-wdc/wdc-java)
[![Stories in Ready](https://badge.waffle.io/kpi-wdc/wdc-java.png?label=ready&title=Ready)](https://waffle.io/kpi-wdc/wdc-java)

#### Prerequisites
- maven is installed and available in `PATH`
- git is installed and available in `PATH`

For developers:

- node.js is installed
- npm is installed (1.2 doesn't work, 1.4 works fine, check with `npm --version`.
Install new npm with `npm install -g npm` and make sure new npm is in `PATH` with higher priority than the old one.
- bower is installed (run `npm install -g bower` as admin)
- gulp is installed (run `npm install -g gulp` as admin)
- karma is installed (run `npm install -g karma` as admin)
- protractor is installed (run `npm install -g protractor` as admin)
- chrome and firefox (optional) are installed


## Build
To run this project from terminal run the following command:

     mvn compile tomcat7:run

Intellij idea project has preconfigured maven run configuration.

## API docs
To generate API documentation run `gulp docs`

Open `src/main/webapp/build/docs/index.html` to access it in the browser.

## Debugging:

  If you want to debug javascript code - set your breakpoints in `src/main/webapp/build`,
  not in `src/main/webapp/resources` or `src/main/webapp/WEB-INF/`.
  Otherwise it won't work for you.

## Project style guides:

  - MOST IMPORTANT: follow the existing code style
  - Make sensible variable names
  - Don't use `git pull`, use `git pull --rebase` instead. Merge commits are evil. You can run `git config branch.master.rebase true` to make `git pull` behave like `git pull --rebase` on project basis.
  - Use commit names in format `[SUBPROJECT] explanation` or `[FEATURE] explanation` or `[FILE] explanation`. Examples:
      -  [build] Change gulp task
      -  [front-end] added new feature
      -  [hotfix] fixed mistake in previous commit
      -  [test] added new tests
      -  [hibernate] changed configs
      -  [travis] removed module
      -  [heroku] changed env variables
  - Use branches:
     - `master` branch for stable code synced from `develop` and bugfixes.
     - `develop` branch for code in development. Should be regularly merged into `master`
     - feature-branches for single features development. Should be merged into `develop`.
     - git tags on master branch to mark releases (like `v0.4.3` or `v1.0`)

## Used technologies

  - git (version control)
  - maven (back-end task-runner & dependency management system)
  - javascript (ES6)
  - java/spring (back-end)
  - databases (back-end)
  - hibernate (back-end)
  - npm (front-end dev. dependencies)
  - bower (front-end dependencies)
  - gulp (front-end task-runner)
  - karma (JS unit-test runner)
  - protractor (JS end-to-end test runner)
  - jasmine (JS test framework)
  - angularjs (front-end, MVVM framework)
  - requirejs (front-end, runtime dependency management)
  - less (front-end, css replacement)
  - jsdoc (JavaScript documentation engine)
  - REST (back-end + front-end)
  - travis (continuous integration)
  - heroku (PaaS, used for app deployment)

## Intellij Idea

The following steps will make your work with Intellij Idea more productive

1. Set Java version >= 7
2. Set JavaScript version - EcmaScript 6
3. Install TypeScript community stubs for front-end javascript dependencies.

### Suggested intellij idea plugins:

  - maven
  - spring
  - NodeJS
  - gulp
  - karma
  - hibernate
  - LESS
  - gitignore (for syntax highlight)
  - angularjs
  - markdown

## Suggested Chrome extensions:

  - angularjs batarang
  - JetBrains IDE support

Also look into [src/main/webapp/README.md](src/main/webapp/README.md) for front-end documentation.
