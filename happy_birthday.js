let red = 255;
let green = 0;
let blue = 0;
const message = "happy birthday!!!!";
let index = 1;

const interval = setInterval(() => {
	process.stdout.write(message[index++]);
	if (index == message.length)
		rainbow();
}, 50);

function rainbow() {
	clearInterval(interval);
	setInterval(() => {
		calcColours();
		cls();
		process.stdout.write("\033[38;2;" + red + ";" + green + ";" + blue + "m" + message);
	}, 1);
}

function cls() {  
	process.stdout.write("\033[H\033[2J");
}

function calcColours() {
	if (red == 255 && blue == 0) {
		green++;
	}
	if (green == 255 && blue == 0) {
		red--;
	}
	if (green == 255 && red == 0) {
		blue++;
	}
	if (blue == 255 && red == 0) {
		green--;
	}
	if (blue == 255 && green == 0) {
		red++;
	}
	if (red == 255 && green == 0) {
		blue--;
	}
}

cls();
process.stdout.write(message[0]);