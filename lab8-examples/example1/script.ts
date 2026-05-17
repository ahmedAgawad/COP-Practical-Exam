enum GridStatus {
	NORMAL = 1,
	WARNING = "W",
	CRITICAL = "C",
}


let trafficSensor: [number, string, GridStatus, number?] = [1, "GX", GridStatus.CRITICAL, 2];
let trafficSensor1: [number, string, GridStatus, number?] = [2, "XG", GridStatus.WARNING, 99];
let trafficSensor2: [number, string, GridStatus, number?] = [3, "GX", GridStatus.CRITICAL, 2];

let activeSensors: [number, string, GridStatus, number?][] = [
	trafficSensor,
	trafficSensor1,
	trafficSensor2,
];

let legacyData: any;
if (Math.random() > 0.5) {
	legacyData = ["offline", 404];
} else {
	legacyData = false;
}

function systemFailure(message: string): never {
	console.log("System shutting down...");
	throw new Error(message);
}

function evaluateSensor(sensorTuple: [number, string, GridStatus, number?]): void {
	console.log(`Sensor ID: ${sensorTuple[0]}`);
	console.log(`Location: ${sensorTuple[1]}`);

	if (sensorTuple[2] === GridStatus.CRITICAL) {
		systemFailure("Grid Overload Initiated!");
	}
}

for (let i = 0; i < activeSensors.length; i++) {
	evaluateSensor(activeSensors[i]);
}
