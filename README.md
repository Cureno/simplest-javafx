To run the project, cd into the directory where this README.md file is located, then type:

```
lein run
```
This should print to the console:
```
Compiling simplest-javafx.core
```
Then it will display a window without a title.

Also note that resizing the window seems broken BUT it is working properly.

This strange behavior has to do with the fact that the "javafx.stage.Stage" instance hasn't set any "javafx.scene.Scene".