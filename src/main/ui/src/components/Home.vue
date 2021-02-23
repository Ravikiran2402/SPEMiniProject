<template>
    <div class="relative bg-red-300 mt-0 pt-0">
        <h1 class="font-bold font-sans text-3xl text-center py-2">Calculator</h1>
    </div>
    <div class="relative flex justify-center w-full h-1/2">
        <div class="relative flex flex-col bg-yellow-200 box-border border-black border-solid border-2 mt-40 w-1/3">
            <div class="relative flex flex-row my-5 mx-5 h-1/4 justify-items-center">
                <div class="relative flex justify-center bg-gray-400 w-1/5 h-auto mx-auto my-auto rounded-full rounded-r-none text-black font-bold text-xl">x = </div>
                <div class="relative flex justify-center bg-white w-4/5 h-auto mx-auto my-auto rounded-full rounded-l-none text-xl overflow-hidden outline-none">
                    <input class="relative w-full h-auto overflow-hidden outline-none px-2" type="text" v-model="input_number" placeholder="Enter Input Number"/>
                </div>
            </div>
            <div class="relative flex flex-row mx-auto my-auto space-x-10">
                <button class="relative bg-green-400 w-1/4 h-full object-cover px-4 py-4 rounded-md" v-on:click='rootButtonLog()'>
                    <span class="">
                        <i class="fas fa-square-root-alt text-xl text-black"></i>
                        <!-- <svg-icon icon="src/assets/square-root-mathematical-symbol.svg" /> -->
                    </span>
                    
                </button>
                <button class="relative bg-green-400 w-1/4 h-full object-cover px-4 py-4 rounded-md text-lg text-black font-bold" v-on:click='factorialButtonLog()'>x!</button>
                <button class="relative bg-green-400 w-1/4 h-full object-cover px-4 py-4 rounded-md text-lg text-black font-bold" v-on:click='logButtonLog()'>ln(x)</button>
                <button class="relative bg-green-400 w-1/4 h-full object-cover px-4 py-4 rounded-md text-lg text-black font-bold" v-on:click='powerButtonLog()'>x^4</button>
            </div>
            <div class="relative flex flex-row my-5 mx-5 h-1/4 justify-items-center">
                <div class="relative flex justify-center bg-gray-400 w-1/5 mx-auto my-auto rounded-full rounded-r-none text-black font-bold text-xl">Result = </div>
                <div class="relative flex justify-center bg-white w-4/5 mx-auto my-auto rounded-full rounded-l-none text-xl">
                    {{output_number}}
                </div>
            </div>
        </div>
    </div>
    
</template>

<script>
import {getRoot, getFactorial, getPower, getLog} from '../services/computeServices'

export default {
    name: 'Home',
    data() {
        return {
            input_number:'',
            output_number:'1',
            exponent:'4'
        }
    },
    methods: {
        rootButtonLog() {
            console.log("root function requested!");
            getRoot(this.input_number).then(response => {
                console.log(response);
                this.output_number = response.output;
            })
        },
        factorialButtonLog() {
            console.log("factorial function requested!")
            getFactorial(this.input_number).then(response => {
                console.log(response);
                this.output_number = response.output;
            })
        },
        powerButtonLog() {
            console.log("power function requested!")
            getPower(this.input_number, this.exponent).then(response => {
                console.log(response);
                this.output_number = response.output;
            })
        },
        logButtonLog() {
            console.log("log function requested!")
            getLog(this.input_number).then(response => {
                console.log(response);
                this.output_number = response.output;
            })
        }
    },
}
</script>

<style>

</style>