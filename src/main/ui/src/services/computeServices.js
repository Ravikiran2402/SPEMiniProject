export async function getRoot(number) {
    const address = await fetch("http://localhost:9999/root/?n="+number);
    return await address.json();
}

export async function getFactorial(number) {
    const address = await fetch("http://localhost:9999/factorial/?n="+number);
    return await address.json();
}

export async function getPower(number, exponent) {
    const address = await fetch("http://localhost:9999/power/?b="+number+"&e="+exponent);
    return await address.json();
}

export async function getLog(number) {
    const address = await fetch("http://localhost:9999/log/?n="+number);
    return await address.json();
}