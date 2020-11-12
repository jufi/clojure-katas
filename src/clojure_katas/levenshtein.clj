(ns clojure-katas.levenshtein
  (:require [clojure.string :as str])
  (:require [clojure-katas.core :as core]))

(core/defproblem levenshtein
                 "Compute the amount of difference between two sequences,
                  also known as edit distance. For example, the edit distance
                  between kitten and sitten is 1 because we can simply replace
                  k with s; the edit distance between hi and hit is 1 because
                  we can remove t at the end of t"
                 [str1 str2]
                 (println "test")
                 )

(defn chars_are_equal [char1 char2]
  (= char1 char2))

(defn cast_to_chars [str1]
  (into [] (seq (chars (char-array str1)))))

(defn length_diff [str1 str2]
  (Math/abs (- (count str1) (count str2))))

(defn calculate_lev_dist [str1 str2]
  (+ (length_diff str1 str2) (count (filter false? (map chars_are_equal (cast_to_chars str1) (cast_to_chars str2))))))