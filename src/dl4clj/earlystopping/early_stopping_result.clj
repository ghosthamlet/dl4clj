(ns dl4clj.earlystopping.early-stopping-result
  (:import [org.deeplearning4j.earlystopping EarlyStoppingResult])
  (:require [dl4clj.constants :as enum]))

(defn new-early-stopping-result
  "contains the results of the early stopping training,

  :termination-reason (keyword), why early stopping happened
   - one of :epoch-termination-condition, :error, :iteration-termination-condition

  :termination-details (str), a description of why termination happened

  :score-vs-epoch (map) {(int) (int)}, the first int is the score, the second the epoch

  :best-model-epoch (int), the epoch during which the model performed the best

  :best-model-score (double), the best score the model had during training

  :total-epochs (int), the total number of epochs run

  :best-model (nn), the neural network which was the best version of the model

  I do not believe this needs to be a user facing fn, but need to test to determine"
  [& {:keys [termination-reason termination-details
             score-vs-epoch best-model-epoch best-model-score
             total-epochs best-model]}]
  (EarlyStoppingResult. (enum/value-of {:termination-condition termination-reason})
                        termination-details score-vs-epoch best-model-epoch
                        best-model-score total-epochs best-model))