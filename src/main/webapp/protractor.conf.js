exports.config = {
    baseUrl: 'http://localhost:8080',
    specs: ['build/test/e2e/**/*Spec.js'],
    allScriptsTimeout: 20000,

    capabilities: {
        'browserName': 'firefox'
    },

    framework: 'jasmine',

    resultJsonOutputFile: 'protractor.log',

    onPrepare: function() {
        // implicit and page load timeouts
        browser.manage().timeouts().pageLoadTimeout(60000);
        browser.manage().timeouts().implicitlyWait(35000);

        browser.ignoreSynchronization = true;
    }
};
