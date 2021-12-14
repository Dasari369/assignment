const fs = require('fs');
const path = require('path');

__dirname = "D:\corejava"



fs.readFile(path.join(__dirname,'/Day1_JavaExample','/src','/com','/sonata','/MyFirstJava.java'),'utf8',(err,data)=>{
    if(err)throw err;
    console.log(data);
});  