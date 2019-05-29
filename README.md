To run the project, cd in to the directory where this README.md file is then type:

```
lein run
```
This should print to the console:
```
Compiling simples-javafx.core
```
Then this will display a window without a title.

Also note that resizing the window seems broken BUT it is working properly.

This strange behavior has to with the fact that the "javafx.stage.Stage" instance hasn't set any "javafx.scene.Scene".