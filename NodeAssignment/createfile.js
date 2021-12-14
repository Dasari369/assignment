const fs = require('fs');
const path = require('path');

//Making directory with name Training Details 
/* fs.mkdir(path.join(__dirname,"/Training Details"),{},function(err){
    if(err) throw err;
    console.log('')
}
) */

// create and to write data to the file
 /* fs.writeFile(path.join(__dirname,'/Training Details','/student.txt')
,'This is Student file'
,(err) => {
    if(err) throw err;
    console.log('File Written to ...');
}
) */
// reading the data from the file 
fs.readFile(path.join(__dirname,'/Training Details','/student.txt'),'utf8',(err,data)=>{
    if(err)throw err;
    console.log(data);
});  