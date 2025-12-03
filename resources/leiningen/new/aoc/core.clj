(ns {{namespace}}
  (:require
   [had-utils.io :as hio]
   [had-utils.collections :as hc]
   [had-utils.core :as hcore]
   [superstring.core :as str]
   [clojure.set :as s]))

(defn parse-input [file])

(def test-input (parse-input "test-input.txt"))
(def input (parse-input "input.txt"))

(defn run-1 [input]
  input)

(defn test-1 []
  (run-1 test-input))

(defn main-1 []
  (run-1 input))

(defn run-2 [input]
  input)

(defn test-2 []
  (run-2 test-input))

(defn main-2 []
  (run-2 input))
