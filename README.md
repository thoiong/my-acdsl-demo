# my-acdsl-demo
Application Configuration as Code (ACaC) - concept demo 

Codes for My Application Configuration Domain Specific Language (myDACDSL).  Set of eclipse xtext projects.  

Demonstating concept of writing application configuration in a text file (.myacdsl) and having application's configuration, deployment and managing the environment scripts (setEnv.sh, deployApp.sh, manageEnv.sh) generated.    

Require eclipse with xtext plug-in.  For more information, see https://eclipse.org/Xtext/ 

#==================================
# To experiment with the language:
#==================================
1. get a functional eclipse IDE with xtext plug-in 
2. checkout/clone this repo
3. import all projects
4. to play with the language gramma - edit MyACDSL.xtext, save, right click  >Run As > Generate Xtext Artifacts
5. to play with scripts generator - edit MyACDSLGenerator.xtend

#==================================
# To use the language:
#==================================
- right click "org.acac.demo.acdsl" project > Run As > Eclipse Application
- create a general prject
- create new file with extension .myacdsl
- edit .myacdsl, save, checkout contents of generated scripts.




