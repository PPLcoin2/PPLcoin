/**
*  Creates file in given path/directory
*  folderPath variable given by Core.java (dependent on install path and device)
*  fileName variable given by Core.java
*  (check variables are not system commands)
**/

String fileCreation  = folderPath + fileName;

File f = new File(fileCreation);
if(!f.exists()){
   f.createNewFile();
}
