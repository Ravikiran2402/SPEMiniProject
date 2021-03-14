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
            <div class="relative flex flex-row mx-6 my-auto space-x-10">
                <button class="relative bg-green-400 w-1/4 h-full px-4 py-4 rounded-md text-lg text-black font-bold" v-on:click='rootButtonLog()'>sqrt(x)</button>
                <button class="relative bg-green-400 w-1/4 h-full px-4 py-4 rounded-md text-lg text-black font-bold" v-on:click='factorialButtonLog()'>x!</button>
                <button class="relative bg-green-400 w-1/4 h-full px-4 py-4 rounded-md text-lg text-black font-bold" v-on:click='logButtonLog()'>ln(x)</button>
                <button class="relative bg-green-400 w-1/4 h-full px-4 py-4 rounded-md text-lg text-black font-bold" 
                        v-if="!change_exponent"
                        v-on:click='powerButtonLog()'
                        v-on:click.right.prevent='toggle_exponent_edit()'>
                        x^{{exponent}}
                </button>
                <input class="relative w-1/4 h-full px-4 py-4 rounded-md" type="text" 
                        v-if="change_exponent"
                        v-model="exponent" 
                        v-on:click.right.prevent='toggle_exponent_edit()' />
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
            exponent:'4',
            change_exponent: false,
        }
    },
    methods: {
        rootButtonLog() {
            console.log("root function requested!");
            getRoot(this.input_number).then(response => {
                console.log(response);
                if(response.status==0) {
                    this.output_number = response.output;
                }
                else {
                    this.output_number = response.message;
                }
            })
        },
        factorialButtonLog() {
            console.log("factorial function requested!")
            getFactorial(this.input_number).then(response => {
                console.log(response);
                if(response.status==0) {
                    this.output_number = response.output;
                }
                else {
                    this.output_number = response.message;
                }
            })
        },
        powerButtonLog() {
            console.log("power function requested!")
            getPower(this.input_number, this.exponent).then(response => {
                console.log(response);
                if(response.status==0) {
                    this.output_number = response.output;
                }
                else {
                    this.output_number = response.message;
                }
            })
        },
        logButtonLog() {
            console.log("log function requested!")
            getLog(this.input_number).then(response => {
                console.log(response);
                if(response.status==0) {
                    this.output_number = response.output;
                }
                else {
                    this.output_number = response.message;
                }
            })
        },
        toggle_exponent_edit() {
            console.log(this.change_exponent);
            this.change_exponent = !this.change_exponent;
        },
    },
}
</script>

<style>

</style>