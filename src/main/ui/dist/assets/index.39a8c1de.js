import{o as t,c as e,a as o,w as n,v as l,t as u,F as r,b as a}from"./vendor.b2c954e4.js";!function(t=".",e="__import__"){try{self[e]=new Function("u","return import(u)")}catch(o){const n=new URL(t,location),l=t=>{URL.revokeObjectURL(t.src),t.remove()};self[e]=t=>new Promise(((o,u)=>{const r=new URL(t,n);if(self[e].moduleMap[r])return o(self[e].moduleMap[r]);const a=new Blob([`import * as m from '${r}';`,`${e}.moduleMap['${r}']=m;`],{type:"text/javascript"}),s=Object.assign(document.createElement("script"),{type:"module",src:URL.createObjectURL(a),onerror(){u(new Error(`Failed to import: ${t}`)),l(s)},onload(){o(self[e].moduleMap[r]),l(s)}});document.head.appendChild(s)})),self[e].moduleMap={}}}("/assets/");const s={name:"Home",data:()=>({input_number:"",output_number:"1",exponent:"4"}),methods:{rootButtonLog(){console.log("root function requested!"),async function(t){const e=await fetch("http://localhost:9999/root/?n="+t);return await e.json()}(this.input_number).then((t=>{console.log(t),this.output_number=t.output}))},factorialButtonLog(){console.log("factorial function requested!"),async function(t){const e=await fetch("http://localhost:9999/factorial/?n="+t);return await e.json()}(this.input_number).then((t=>{console.log(t),this.output_number=t.output}))},powerButtonLog(){console.log("power function requested!"),async function(t,e){const o=await fetch("http://localhost:9999/power/?b="+t+"&e="+e);return await o.json()}(this.input_number,this.exponent).then((t=>{console.log(t),this.output_number=t.output}))},logButtonLog(){console.log("log function requested!"),async function(t){const e=await fetch("http://localhost:9999/log/?n="+t);return await e.json()}(this.input_number).then((t=>{console.log(t),this.output_number=t.output}))}}},c=o("div",{class:"relative bg-red-300 mt-0 pt-0"},[o("h1",{class:"font-bold font-sans text-3xl text-center py-2"},"Calculator")],-1),i={class:"relative flex justify-center w-full h-1/2"},d={class:"relative flex flex-col bg-yellow-200 box-border border-black border-solid border-2 mt-40 w-1/3"},f={class:"relative flex flex-row my-5 mx-5 h-1/4 justify-items-center"},p=o("div",{class:"relative flex justify-center bg-gray-400 w-1/5 h-auto mx-auto my-auto rounded-full rounded-r-none text-black font-bold text-xl"},"x = ",-1),m={class:"relative flex justify-center bg-white w-4/5 h-auto mx-auto my-auto rounded-full rounded-l-none text-xl overflow-hidden outline-none"},b={class:"relative flex flex-row mx-auto my-auto space-x-10"},x=o("span",{class:""},[o("i",{class:"fas fa-square-root-alt text-xl text-black"})],-1),h={class:"relative flex flex-row my-5 mx-5 h-1/4 justify-items-center"},g=o("div",{class:"relative flex justify-center bg-gray-400 w-1/5 mx-auto my-auto rounded-full rounded-r-none text-black font-bold text-xl"},"Result = ",-1),w={class:"relative flex justify-center bg-white w-4/5 mx-auto my-auto rounded-full rounded-l-none text-xl"};s.render=function(a,s,v,y,j,_){return t(),e(r,null,[c,o("div",i,[o("div",d,[o("div",f,[p,o("div",m,[n(o("input",{class:"relative w-full h-auto overflow-hidden outline-none px-2",type:"text","onUpdate:modelValue":s[1]||(s[1]=t=>j.input_number=t),placeholder:"Enter Input Number"},null,512),[[l,j.input_number]])])]),o("div",b,[o("button",{class:"relative bg-green-400 w-1/4 h-full object-cover px-4 py-4 rounded-md",onClick:s[2]||(s[2]=t=>_.rootButtonLog())},[x]),o("button",{class:"relative bg-green-400 w-1/4 h-full object-cover px-4 py-4 rounded-md text-lg text-black font-bold",onClick:s[3]||(s[3]=t=>_.factorialButtonLog())},"x!"),o("button",{class:"relative bg-green-400 w-1/4 h-full object-cover px-4 py-4 rounded-md text-lg text-black font-bold",onClick:s[4]||(s[4]=t=>_.logButtonLog())},"ln(x)"),o("button",{class:"relative bg-green-400 w-1/4 h-full object-cover px-4 py-4 rounded-md text-lg text-black font-bold",onClick:s[5]||(s[5]=t=>_.powerButtonLog())},"x^4")]),o("div",h,[g,o("div",w,u(j.output_number),1)])])])],64)};const v={class:"bg-pink-200 absolute w-full h-full mt-0 pt-0"};a({expose:[],setup:n=>(n,l)=>(t(),e("div",v,[o(s)]))}).mount("#app");
