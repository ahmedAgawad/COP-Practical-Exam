function initializeBot(name, role = "Worker", version) {
	console.log(`A bot named ${name} with role ${role} and a version ${version}`);
}

initializeBot("Alpha", undefined, 2.0);

function Mechanism(serialNumber) {
	this.serialNumber = serialNumber;
}

Mechanism.prototype.diagnose = function () {
	console.log(`Diagnosing mechanism : [${this.serialNumber}]`);
};

class Computer {
	constructor(brand) {
		this.brand = brand;
	}

	calculate() {
		console.log("Computing data...");
	}
}

class AIProcessor extends Computer {
	constructor(brand, cores) {
		super(brand);
		this.cores = cores;
	}

	calculate() {
		console.log(`AI utilizing ${this.cores} cores`);
		super.calculate();
	}
}

let loosePart = { serialNumber: "X-999" };
Object.setPrototypeOf(loosePart, Mechanism.prototype);

loosePart.diagnose();

let stealthDrone = new (class extends Computer {
	cloak() {
		console.log(`Cloaking engaged for ${this.brand}`);
	}
})("Ghost");

stealthDrone.cloak();
