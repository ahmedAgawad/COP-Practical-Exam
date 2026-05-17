const users = [
	{
		username: "alex",
		age: 20,
		isActive: true,
		role: "admin",
	},
	{ username: "john", age: 19, isActive: true, role: "basic" },
	{ username: "max", age: 23, isActive: true, role: "premium" },
];

let activeUserCount = 0;
for (let i = 0; i < users.length; i++) {
	if (users[i].isActive) {
		activeUserCount++;
	}

	if (users[i].role === "admin") {
		console.log(`Full system access of current user ${users[i].username}`);
	} else if (users[i].role === "premium" && users[i].isActive === true) {
		console.log(`Premium access for this access username ${users[i].username}`);
	} else {
		console.log(`Standard Access for user ${users[i].username}`);
	}
}

activeUserCount > 0
	? console.log(`System is active with ${activeUserCount} users`)
	: console.log(`System is idel no active users`);
