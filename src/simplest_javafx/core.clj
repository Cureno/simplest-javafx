(ns simplest-javafx.core
  (:gen-class :extends javafx.application.Application)
  (:import (javafx.application Application)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  ; note that there is an underscore _ instead of a dash -
  (Application/launch simplest_javafx.core args)) 

(defn -start
  "overrides javafx.application.Application's start(Stage primaryStage) method"
  [this stage]
  (.show stage))