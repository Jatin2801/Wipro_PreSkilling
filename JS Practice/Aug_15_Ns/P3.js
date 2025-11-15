var http = require("http");

http.createServer(function (req, res) {
    res.write("Welcome to Node Js...");
    res.end();
}).listen(8081);