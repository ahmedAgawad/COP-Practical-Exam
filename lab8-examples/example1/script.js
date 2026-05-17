"use strict";
var GridStatus;
(function (GridStatus) {
    GridStatus[GridStatus["NORMAL"] = 1] = "NORMAL";
    GridStatus["WARNING"] = "W";
    GridStatus["CRITICAL"] = "C";
})(GridStatus || (GridStatus = {}));
let trafficSensor = [1, "GX", GridStatus.CRITICAL, 2];
let trafficSensor1 = [2, "XG", GridStatus.WARNING, 99];
let trafficSensor2 = [3, "GX", GridStatus.CRITICAL, 2];
let activeSensors = [trafficSensor, trafficSensor1, trafficSensor2];
let legacyData;
if (Math.random() > 0.5) {
    legacyData = ["offline", 404];
}
else {
    legacyData = false;
}
function systemFailure(message) {
    console.log("run");
    throw new Error(message);
}
function evaluateSensor(sensorTuple) {
    console.log(sensorTuple[0]);
    console.log(sensorTuple[1]);
    if (sensorTuple[3] === GridStatus.CRITICAL) {
        systemFailure("Grid Overload Initiated!");
    }
}
for (let i = 0; i < activeSensors.length; i++) {
    evaluateSensor(activeSensors[i]);
}
