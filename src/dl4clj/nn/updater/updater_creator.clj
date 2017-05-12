(ns ^{:doc "Implementation of the UpdaterCreator class.
see: https://deeplearning4j.org/doc/org/deeplearning4j/nn/updater/UpdaterCreator.html"}
    dl4clj.nn.updater.updater-creator
  (:import [org.deeplearning4j.nn.updater UpdaterCreator]))

(defn get-updater
  "returns the updater for a supplied layer

  see dl4clj.nn.conf.builders.builders"
  [layer]
  (.getUpdater layer))