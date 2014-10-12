var gulp = require('gulp');
var bower = require('gulp-bower');
var less = require('gulp-less');
var minifyCSS = require('gulp-minify-css');
var del = require('del');
var path = require('path');

gulp.task('default', ['bower', 'less']);

gulp.task('bower', function () {
    // bower({directory: './components', cwd: './' });
    bower('./components');
});

gulp.task('less', function () {
    gulp.src('./WEB-INF/less/**/*.less')
        .pipe(less())
        .pipe(minifyCSS())
        .pipe(gulp.dest('./generated-css'));
});

gulp.task('clean', function (cb) {
   return del([
       './components',
       ], cb);
});