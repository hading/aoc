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

(defn main-1 [input]
  input)

(defn test-1 []
  (main-1 test-input))
(defn real-1 []
  (main-1 input)[])

(defn main-2 [input]
  input)

(defn test-2 []
  (main-2 test-input))
(defn real-2 []
  (main-2 input))
