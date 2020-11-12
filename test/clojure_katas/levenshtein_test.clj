(ns clojure-katas.levenshtein-test
  (:use clojure.test
        clojure-katas.levenshtein))

(deftest levenshtein-test
  (testing "return edit distance between two strings"
    (is (= 3 (clojure-katas.levenshtein/calculate_lev_dist "kitten" "sitt")))))

