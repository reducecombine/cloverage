({:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (ns
   cloverage.sample.exercise-instrumentation
   (:refer-clojure :exclude [loop])
   (:import java.lang.RuntimeException)
   (:require [clojure.test :refer :all])),
  :line 1,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (ns
   cloverage.sample.exercise-instrumentation
   (:refer-clojure :exclude [loop])
   (:import java.lang.RuntimeException)
   (:require [clojure.test :refer :all])),
  :covered true,
  :text "(ns cloverage.sample.exercise-instrumentation"}
 {:text "  (:refer-clojure :exclude [loop])",
  :line 2,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:text "  (:import java.lang.RuntimeException)",
  :line 3,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:text "  (:require [clojure.test :refer :all]))",
  :line 4,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:text "",
  :line 5,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:text "'()",
  :line 6,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:text "",
  :line 7,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  ((cloverage.instrument/wrapm cloverage.coverage/track-coverage 8 +)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    8
    40)),
  :line 8,
  :lib cloverage.sample.exercise-instrumentation,
  :form (+ 40),
  :covered true,
  :text "(+ 40)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form +,
  :line 8,
  :lib cloverage.sample.exercise-instrumentation,
  :form +,
  :covered true,
  :text "(+ 40)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form 40,
  :line 8,
  :lib cloverage.sample.exercise-instrumentation,
  :form 40,
  :covered true,
  :text "(+ 40)"}
 {:text "",
  :line 9,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (.
   clojure.lang.Numbers
   (add
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     10
     40)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     10
     2))),
  :line 10,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (.
   clojure.lang.Numbers
   (add
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     10
     40)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     10
     2))),
  :covered true,
  :text "(+ 40 2)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form 40,
  :line 10,
  :lib cloverage.sample.exercise-instrumentation,
  :form 40,
  :covered true,
  :text "(+ 40 2)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form 2,
  :line 10,
  :lib cloverage.sample.exercise-instrumentation,
  :form 2,
  :covered true,
  :text "(+ 40 2)"}
 {:text "",
  :line 11,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  ((cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    12
    str)
   (cloverage.instrument/wrapm cloverage.coverage/track-coverage 12 1)
   (cloverage.instrument/wrapm cloverage.coverage/track-coverage 12 2)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    12
    3)),
  :line 12,
  :lib cloverage.sample.exercise-instrumentation,
  :form (str 1 2 3),
  :covered true,
  :text "(str 1 2 3)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form str,
  :line 12,
  :lib cloverage.sample.exercise-instrumentation,
  :form str,
  :covered true,
  :text "(str 1 2 3)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form 1,
  :line 12,
  :lib cloverage.sample.exercise-instrumentation,
  :form 1,
  :covered true,
  :text "(str 1 2 3)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form 2,
  :line 12,
  :lib cloverage.sample.exercise-instrumentation,
  :form 2,
  :covered true,
  :text "(str 1 2 3)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form 3,
  :line 12,
  :lib cloverage.sample.exercise-instrumentation,
  :form 3,
  :covered true,
  :text "(str 1 2 3)"}
 {:text "",
  :line 13,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (.
   clojure.lang.Numbers
   (add
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     14
     (* 2 3))
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     14
     (/ 12 3)))),
  :line 14,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (.
   clojure.lang.Numbers
   (add
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     14
     (* 2 3))
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     14
     (/ 12 3)))),
  :covered true,
  :text "(+ (* 2 3)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (.
   clojure.lang.Numbers
   (multiply
    (cloverage.instrument/wrapm cloverage.coverage/track-coverage 14 2)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     14
     3))),
  :line 14,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (.
   clojure.lang.Numbers
   (multiply
    (cloverage.instrument/wrapm cloverage.coverage/track-coverage 14 2)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     14
     3))),
  :covered true,
  :text "(+ (* 2 3)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form 2,
  :line 14,
  :lib cloverage.sample.exercise-instrumentation,
  :form 2,
  :covered true,
  :text "(+ (* 2 3)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form 3,
  :line 14,
  :lib cloverage.sample.exercise-instrumentation,
  :form 3,
  :covered true,
  :text "(+ (* 2 3)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (.
   clojure.lang.Numbers
   (divide
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     15
     12)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     15
     3))),
  :line 15,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (.
   clojure.lang.Numbers
   (divide
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     15
     12)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     15
     3))),
  :covered true,
  :text "   (/ 12 3))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form 12,
  :line 15,
  :lib cloverage.sample.exercise-instrumentation,
  :form 12,
  :covered true,
  :text "   (/ 12 3))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form 3,
  :line 15,
  :lib cloverage.sample.exercise-instrumentation,
  :form 3,
  :covered true,
  :text "   (/ 12 3))"}
 {:text "",
  :line 16,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (let
   [a
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     17
     (+ 40 2))
    b
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     17
     (+ 3 4))]
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    17
    (* a b))),
  :line 17,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (let
   [a
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     17
     (+ 40 2))
    b
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     17
     (+ 3 4))]
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    17
    (* a b))),
  :covered true,
  :text "(let [a (+ 40 2)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (.
   clojure.lang.Numbers
   (add
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     17
     40)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     17
     2))),
  :line 17,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (.
   clojure.lang.Numbers
   (add
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     17
     40)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     17
     2))),
  :covered true,
  :text "(let [a (+ 40 2)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form 40,
  :line 17,
  :lib cloverage.sample.exercise-instrumentation,
  :form 40,
  :covered true,
  :text "(let [a (+ 40 2)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form 2,
  :line 17,
  :lib cloverage.sample.exercise-instrumentation,
  :form 2,
  :covered true,
  :text "(let [a (+ 40 2)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (.
   clojure.lang.Numbers
   (add
    (cloverage.instrument/wrapm cloverage.coverage/track-coverage 18 3)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     18
     4))),
  :line 18,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (.
   clojure.lang.Numbers
   (add
    (cloverage.instrument/wrapm cloverage.coverage/track-coverage 18 3)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     18
     4))),
  :covered true,
  :text "      b (+ 3 4)]"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form 3,
  :line 18,
  :lib cloverage.sample.exercise-instrumentation,
  :form 3,
  :covered true,
  :text "      b (+ 3 4)]"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form 4,
  :line 18,
  :lib cloverage.sample.exercise-instrumentation,
  :form 4,
  :covered true,
  :text "      b (+ 3 4)]"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (.
   clojure.lang.Numbers
   (multiply
    (cloverage.instrument/wrapm cloverage.coverage/track-coverage 19 a)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     19
     b))),
  :line 19,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (.
   clojure.lang.Numbers
   (multiply
    (cloverage.instrument/wrapm cloverage.coverage/track-coverage 19 a)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     19
     b))),
  :covered true,
  :text "  (* a b))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form a,
  :line 19,
  :lib cloverage.sample.exercise-instrumentation,
  :form a,
  :covered true,
  :text "  (* a b))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form b,
  :line 19,
  :lib cloverage.sample.exercise-instrumentation,
  :form b,
  :covered true,
  :text "  (* a b))"}
 {:text "",
  :line 20,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  {(cloverage.instrument/wrapm cloverage.coverage/track-coverage 21 :a)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    21
    (+ 40 2)),
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    21
    (/ 4 2))
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    21
    "two")},
  :line 21,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  {(cloverage.instrument/wrapm cloverage.coverage/track-coverage 21 :a)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    21
    (+ 40 2)),
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    21
    (/ 4 2))
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    21
    "two")},
  :covered true,
  :text "{:a (+ 40 2)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form :a,
  :line 21,
  :lib cloverage.sample.exercise-instrumentation,
  :form :a,
  :covered true,
  :text "{:a (+ 40 2)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (.
   clojure.lang.Numbers
   (add
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     21
     40)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     21
     2))),
  :line 21,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (.
   clojure.lang.Numbers
   (add
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     21
     40)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     21
     2))),
  :covered true,
  :text "{:a (+ 40 2)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form 40,
  :line 21,
  :lib cloverage.sample.exercise-instrumentation,
  :form 40,
  :covered true,
  :text "{:a (+ 40 2)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form 2,
  :line 21,
  :lib cloverage.sample.exercise-instrumentation,
  :form 2,
  :covered true,
  :text "{:a (+ 40 2)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form "two",
  :line 21,
  :lib cloverage.sample.exercise-instrumentation,
  :form "two",
  :covered true,
  :text "{:a (+ 40 2)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (.
   clojure.lang.Numbers
   (divide
    (cloverage.instrument/wrapm cloverage.coverage/track-coverage 22 4)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     22
     2))),
  :line 22,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (.
   clojure.lang.Numbers
   (divide
    (cloverage.instrument/wrapm cloverage.coverage/track-coverage 22 4)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     22
     2))),
  :covered true,
  :text " (/ 4 2) \"two\"}"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form 4,
  :line 22,
  :lib cloverage.sample.exercise-instrumentation,
  :form 4,
  :covered true,
  :text " (/ 4 2) \"two\"}"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form 2,
  :line 22,
  :lib cloverage.sample.exercise-instrumentation,
  :form 2,
  :covered true,
  :text " (/ 4 2) \"two\"}"}
 {:text "",
  :line 23,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (def
   function-with-empty-list
   (clojure.core/fn
    ([]
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      24
      '())))),
  :line 24,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (def
   function-with-empty-list
   (clojure.core/fn
    ([]
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      24
      '())))),
  :covered true,
  :text "(defn function-with-empty-list []"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form '(),
  :line 24,
  :lib cloverage.sample.exercise-instrumentation,
  :form '(),
  :covered false,
  :text "(defn function-with-empty-list []"}
 {:text "  ;; used to break stuff - see issues #14 and #17",
  :line 25,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:text "  '())",
  :line 26,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:text "",
  :line 27,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (def
   not-covered-at-all
   (clojure.core/fn
    ([arg1 arg2]
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      28
      (+ 2 3))
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      28
      (- 2 3))))),
  :line 28,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (def
   not-covered-at-all
   (clojure.core/fn
    ([arg1 arg2]
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      28
      (+ 2 3))
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      28
      (- 2 3))))),
  :covered true,
  :text "(defn not-covered-at-all"}
 {:text "  \"This function is not covered at all\"",
  :line 29,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:text "  [arg1 arg2]",
  :line 30,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form
  (.
   clojure.lang.Numbers
   (add
    (cloverage.instrument/wrapm cloverage.coverage/track-coverage 31 2)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     31
     3))),
  :line 31,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (.
   clojure.lang.Numbers
   (add
    (cloverage.instrument/wrapm cloverage.coverage/track-coverage 31 2)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     31
     3))),
  :covered false,
  :text "  (+ 2 3)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form 2,
  :line 31,
  :lib cloverage.sample.exercise-instrumentation,
  :form 2,
  :covered false,
  :text "  (+ 2 3)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form 3,
  :line 31,
  :lib cloverage.sample.exercise-instrumentation,
  :form 3,
  :covered false,
  :text "  (+ 2 3)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form
  (.
   clojure.lang.Numbers
   (minus
    (cloverage.instrument/wrapm cloverage.coverage/track-coverage 32 2)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     32
     3))),
  :line 32,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (.
   clojure.lang.Numbers
   (minus
    (cloverage.instrument/wrapm cloverage.coverage/track-coverage 32 2)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     32
     3))),
  :covered false,
  :text "  (- 2 3))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form 2,
  :line 32,
  :lib cloverage.sample.exercise-instrumentation,
  :form 2,
  :covered false,
  :text "  (- 2 3))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form 3,
  :line 32,
  :lib cloverage.sample.exercise-instrumentation,
  :form 3,
  :covered false,
  :text "  (- 2 3))"}
 {:text "",
  :line 33,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (def
   partially-covered
   (clojure.core/fn
    ([cnd]
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      34
      (if cnd (+ 1 2 3) (- 2 3 4)))))),
  :line 34,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (def
   partially-covered
   (clojure.core/fn
    ([cnd]
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      34
      (if cnd (+ 1 2 3) (- 2 3 4)))))),
  :covered true,
  :text "(defn partially-covered"}
 {:text "  [cnd]",
  :line 35,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (if
   (cloverage.coverage/capture 50 cnd)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    36
    (.
     clojure.lang.Numbers
     (add (. clojure.lang.Numbers (add 1 2)) 3)))
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    36
    (.
     clojure.lang.Numbers
     (minus (. clojure.lang.Numbers (minus 2 3)) 4)))),
  :line 36,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (if
   (cloverage.coverage/capture 50 cnd)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    36
    (.
     clojure.lang.Numbers
     (add (. clojure.lang.Numbers (add 1 2)) 3)))
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    36
    (.
     clojure.lang.Numbers
     (minus (. clojure.lang.Numbers (minus 2 3)) 4)))),
  :covered true,
  :text "  (if cnd (+ 1 2 3) (- 2 3 4)))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form cnd,
  :line 36,
  :lib cloverage.sample.exercise-instrumentation,
  :form cnd,
  :covered true,
  :text "  (if cnd (+ 1 2 3) (- 2 3 4)))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (.
   clojure.lang.Numbers
   (add
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     36
     (. clojure.lang.Numbers (add 1 2)))
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     36
     3))),
  :line 36,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (.
   clojure.lang.Numbers
   (add
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     36
     (. clojure.lang.Numbers (add 1 2)))
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     36
     3))),
  :covered true,
  :text "  (if cnd (+ 1 2 3) (- 2 3 4)))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (.
   clojure.lang.Numbers
   (add
    (cloverage.instrument/wrapm cloverage.coverage/track-coverage 36 1)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     36
     2))),
  :line 36,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (.
   clojure.lang.Numbers
   (add
    (cloverage.instrument/wrapm cloverage.coverage/track-coverage 36 1)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     36
     2))),
  :covered true,
  :text "  (if cnd (+ 1 2 3) (- 2 3 4)))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form 1,
  :line 36,
  :lib cloverage.sample.exercise-instrumentation,
  :form 1,
  :covered true,
  :text "  (if cnd (+ 1 2 3) (- 2 3 4)))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form 2,
  :line 36,
  :lib cloverage.sample.exercise-instrumentation,
  :form 2,
  :covered true,
  :text "  (if cnd (+ 1 2 3) (- 2 3 4)))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form 3,
  :line 36,
  :lib cloverage.sample.exercise-instrumentation,
  :form 3,
  :covered true,
  :text "  (if cnd (+ 1 2 3) (- 2 3 4)))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form
  (.
   clojure.lang.Numbers
   (minus
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     36
     (. clojure.lang.Numbers (minus 2 3)))
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     36
     4))),
  :line 36,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (.
   clojure.lang.Numbers
   (minus
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     36
     (. clojure.lang.Numbers (minus 2 3)))
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     36
     4))),
  :covered false,
  :text "  (if cnd (+ 1 2 3) (- 2 3 4)))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form
  (.
   clojure.lang.Numbers
   (minus
    (cloverage.instrument/wrapm cloverage.coverage/track-coverage 36 2)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     36
     3))),
  :line 36,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (.
   clojure.lang.Numbers
   (minus
    (cloverage.instrument/wrapm cloverage.coverage/track-coverage 36 2)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     36
     3))),
  :covered false,
  :text "  (if cnd (+ 1 2 3) (- 2 3 4)))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form 2,
  :line 36,
  :lib cloverage.sample.exercise-instrumentation,
  :form 2,
  :covered false,
  :text "  (if cnd (+ 1 2 3) (- 2 3 4)))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form 3,
  :line 36,
  :lib cloverage.sample.exercise-instrumentation,
  :form 3,
  :covered false,
  :text "  (if cnd (+ 1 2 3) (- 2 3 4)))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form 4,
  :line 36,
  :lib cloverage.sample.exercise-instrumentation,
  :form 4,
  :covered false,
  :text "  (if cnd (+ 1 2 3) (- 2 3 4)))"}
 {:text "",
  :line 37,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (def
   test-partially-covered
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    38
    (clojure.core/fn
     []
     (clojure.test/test-var #'test-partially-covered)))),
  :line 38,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (def
   test-partially-covered
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    38
    (clojure.core/fn
     []
     (clojure.test/test-var #'test-partially-covered)))),
  :covered true,
  :text "(deftest test-partially-covered"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (clojure.core/fn
   []
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    38
    (clojure.test/test-var #'test-partially-covered))),
  :line 38,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (clojure.core/fn
   []
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    38
    (clojure.test/test-var #'test-partially-covered))),
  :covered true,
  :text "(deftest test-partially-covered"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form
  ((cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    38
    clojure.test/test-var)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    38
    #'test-partially-covered)),
  :line 38,
  :lib cloverage.sample.exercise-instrumentation,
  :form (clojure.test/test-var #'test-partially-covered),
  :covered false,
  :text "(deftest test-partially-covered"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form clojure.test/test-var,
  :line 38,
  :lib cloverage.sample.exercise-instrumentation,
  :form clojure.test/test-var,
  :covered false,
  :text "(deftest test-partially-covered"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form #'test-partially-covered,
  :line 38,
  :lib cloverage.sample.exercise-instrumentation,
  :form #'test-partially-covered,
  :covered false,
  :text "(deftest test-partially-covered"}
 {:text "  (is (= 6 (partially-covered true))))",
  :line 39,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:text "",
  :line 40,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (def
   fully-covered
   (clojure.core/fn
    ([cnd]
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      41
      (if cnd (+ 1 2 3) (- 4 5 6)))))),
  :line 41,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (def
   fully-covered
   (clojure.core/fn
    ([cnd]
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      41
      (if cnd (+ 1 2 3) (- 4 5 6)))))),
  :covered true,
  :text "(defn fully-covered [cnd]"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 2,
  :full-form
  (if
   (cloverage.coverage/capture 68 cnd)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    42
    (.
     clojure.lang.Numbers
     (add (. clojure.lang.Numbers (add 1 2)) 3)))
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    42
    (.
     clojure.lang.Numbers
     (minus (. clojure.lang.Numbers (minus 4 5)) 6)))),
  :line 42,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (if
   (cloverage.coverage/capture 68 cnd)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    42
    (.
     clojure.lang.Numbers
     (add (. clojure.lang.Numbers (add 1 2)) 3)))
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    42
    (.
     clojure.lang.Numbers
     (minus (. clojure.lang.Numbers (minus 4 5)) 6)))),
  :covered true,
  :text "  (if cnd (+ 1 2 3) (- 4 5 6)))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 2,
  :full-form cnd,
  :line 42,
  :lib cloverage.sample.exercise-instrumentation,
  :form cnd,
  :covered true,
  :text "  (if cnd (+ 1 2 3) (- 4 5 6)))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (.
   clojure.lang.Numbers
   (add
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     42
     (. clojure.lang.Numbers (add 1 2)))
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     42
     3))),
  :line 42,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (.
   clojure.lang.Numbers
   (add
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     42
     (. clojure.lang.Numbers (add 1 2)))
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     42
     3))),
  :covered true,
  :text "  (if cnd (+ 1 2 3) (- 4 5 6)))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (.
   clojure.lang.Numbers
   (add
    (cloverage.instrument/wrapm cloverage.coverage/track-coverage 42 1)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     42
     2))),
  :line 42,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (.
   clojure.lang.Numbers
   (add
    (cloverage.instrument/wrapm cloverage.coverage/track-coverage 42 1)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     42
     2))),
  :covered true,
  :text "  (if cnd (+ 1 2 3) (- 4 5 6)))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form 1,
  :line 42,
  :lib cloverage.sample.exercise-instrumentation,
  :form 1,
  :covered true,
  :text "  (if cnd (+ 1 2 3) (- 4 5 6)))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form 2,
  :line 42,
  :lib cloverage.sample.exercise-instrumentation,
  :form 2,
  :covered true,
  :text "  (if cnd (+ 1 2 3) (- 4 5 6)))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form 3,
  :line 42,
  :lib cloverage.sample.exercise-instrumentation,
  :form 3,
  :covered true,
  :text "  (if cnd (+ 1 2 3) (- 4 5 6)))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (.
   clojure.lang.Numbers
   (minus
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     42
     (. clojure.lang.Numbers (minus 4 5)))
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     42
     6))),
  :line 42,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (.
   clojure.lang.Numbers
   (minus
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     42
     (. clojure.lang.Numbers (minus 4 5)))
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     42
     6))),
  :covered true,
  :text "  (if cnd (+ 1 2 3) (- 4 5 6)))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (.
   clojure.lang.Numbers
   (minus
    (cloverage.instrument/wrapm cloverage.coverage/track-coverage 42 4)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     42
     5))),
  :line 42,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (.
   clojure.lang.Numbers
   (minus
    (cloverage.instrument/wrapm cloverage.coverage/track-coverage 42 4)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     42
     5))),
  :covered true,
  :text "  (if cnd (+ 1 2 3) (- 4 5 6)))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form 4,
  :line 42,
  :lib cloverage.sample.exercise-instrumentation,
  :form 4,
  :covered true,
  :text "  (if cnd (+ 1 2 3) (- 4 5 6)))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form 5,
  :line 42,
  :lib cloverage.sample.exercise-instrumentation,
  :form 5,
  :covered true,
  :text "  (if cnd (+ 1 2 3) (- 4 5 6)))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form 6,
  :line 42,
  :lib cloverage.sample.exercise-instrumentation,
  :form 6,
  :covered true,
  :text "  (if cnd (+ 1 2 3) (- 4 5 6)))"}
 {:text "",
  :line 43,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (def
   test-fully-covered
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    44
    (clojure.core/fn
     []
     (clojure.test/test-var #'test-fully-covered)))),
  :line 44,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (def
   test-fully-covered
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    44
    (clojure.core/fn
     []
     (clojure.test/test-var #'test-fully-covered)))),
  :covered true,
  :text "(deftest test-fully-covered"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (clojure.core/fn
   []
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    44
    (clojure.test/test-var #'test-fully-covered))),
  :line 44,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (clojure.core/fn
   []
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    44
    (clojure.test/test-var #'test-fully-covered))),
  :covered true,
  :text "(deftest test-fully-covered"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form
  ((cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    44
    clojure.test/test-var)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    44
    #'test-fully-covered)),
  :line 44,
  :lib cloverage.sample.exercise-instrumentation,
  :form (clojure.test/test-var #'test-fully-covered),
  :covered false,
  :text "(deftest test-fully-covered"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form clojure.test/test-var,
  :line 44,
  :lib cloverage.sample.exercise-instrumentation,
  :form clojure.test/test-var,
  :covered false,
  :text "(deftest test-fully-covered"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form #'test-fully-covered,
  :line 44,
  :lib cloverage.sample.exercise-instrumentation,
  :form #'test-fully-covered,
  :covered false,
  :text "(deftest test-fully-covered"}
 {:text "  (is (= 6 (fully-covered true)))",
  :line 45,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:text "  (is (= -7 (fully-covered false))))",
  :line 46,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:text "",
  :line 47,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (defmulti
   mixed-coverage-multi
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    48
    type)),
  :line 48,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (defmulti
   mixed-coverage-multi
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    48
    type)),
  :covered true,
  :text "(defmulti mixed-coverage-multi type)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form type,
  :line 48,
  :lib cloverage.sample.exercise-instrumentation,
  :form type,
  :covered true,
  :text "(defmulti mixed-coverage-multi type)"}
 {:text "",
  :line 49,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (.
   mixed-coverage-multi
   clojure.core/addMethod
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    50
    String)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    50
    (clojure.core/fn [x] (do ((fn* [] ())) x)))),
  :line 50,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (.
   mixed-coverage-multi
   clojure.core/addMethod
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    50
    String)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    50
    (clojure.core/fn [x] (do ((fn* [] ())) x)))),
  :covered true,
  :text "(defmethod mixed-coverage-multi String"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form String,
  :line 50,
  :lib cloverage.sample.exercise-instrumentation,
  :form String,
  :covered true,
  :text "(defmethod mixed-coverage-multi String"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (clojure.core/fn
   [x]
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    50
    (do ((fn* [] ())) x))),
  :line 50,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (clojure.core/fn
   [x]
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    50
    (do ((fn* [] ())) x))),
  :covered true,
  :text "(defmethod mixed-coverage-multi String"}
 {:text "  ;; fully covered",
  :line 51,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:text "  [x]",
  :line 52,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (do
   (cloverage.coverage/capture
    90
    ((cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      53
      (fn* [] ()))))
   (cloverage.coverage/capture 91 x)),
  :line 53,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (do
   (cloverage.coverage/capture
    90
    ((cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      53
      (fn* [] ()))))
   (cloverage.coverage/capture 91 x)),
  :covered true,
  :text "  (do (#()) ; no-op"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  ((cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    53
    (fn* [] ()))),
  :line 53,
  :lib cloverage.sample.exercise-instrumentation,
  :form ((fn* [] ())),
  :covered true,
  :text "  (do (#()) ; no-op"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (fn*
   []
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    53
    ())),
  :line 53,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (fn*
   []
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    53
    ())),
  :covered true,
  :text "  (do (#()) ; no-op"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form (),
  :line 53,
  :lib cloverage.sample.exercise-instrumentation,
  :form (),
  :covered true,
  :text "  (do (#()) ; no-op"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form x,
  :line 54,
  :lib cloverage.sample.exercise-instrumentation,
  :form x,
  :covered true,
  :text "      x))"}
 {:text "",
  :line 55,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (.
   mixed-coverage-multi
   clojure.core/addMethod
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    56
    Long)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    56
    (clojure.core/fn [x] (if (= x 1) (+ x 2) (- x 2))))),
  :line 56,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (.
   mixed-coverage-multi
   clojure.core/addMethod
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    56
    Long)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    56
    (clojure.core/fn [x] (if (= x 1) (+ x 2) (- x 2))))),
  :covered true,
  :text "(defmethod mixed-coverage-multi Long"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form Long,
  :line 56,
  :lib cloverage.sample.exercise-instrumentation,
  :form Long,
  :covered true,
  :text "(defmethod mixed-coverage-multi Long"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (clojure.core/fn
   [x]
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    56
    (if (= x 1) (+ x 2) (- x 2)))),
  :line 56,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (clojure.core/fn
   [x]
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    56
    (if (= x 1) (+ x 2) (- x 2)))),
  :covered true,
  :text "(defmethod mixed-coverage-multi Long"}
 {:text "  ;; partially covered",
  :line 57,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:text "  [x]",
  :line 58,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (if
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    59
    (. clojure.lang.Util clojure.core/equiv x 1))
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    60
    (. clojure.lang.Numbers (add x 2)))
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    61
    (. clojure.lang.Numbers (minus x 2)))),
  :line 59,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (if
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    59
    (. clojure.lang.Util clojure.core/equiv x 1))
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    60
    (. clojure.lang.Numbers (add x 2)))
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    61
    (. clojure.lang.Numbers (minus x 2)))),
  :covered true,
  :text "  (if (= x 1)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (.
   clojure.lang.Util
   clojure.core/equiv
   (cloverage.instrument/wrapm cloverage.coverage/track-coverage 59 x)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    59
    1)),
  :line 59,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (.
   clojure.lang.Util
   clojure.core/equiv
   (cloverage.instrument/wrapm cloverage.coverage/track-coverage 59 x)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    59
    1)),
  :covered true,
  :text "  (if (= x 1)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form x,
  :line 59,
  :lib cloverage.sample.exercise-instrumentation,
  :form x,
  :covered true,
  :text "  (if (= x 1)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form 1,
  :line 59,
  :lib cloverage.sample.exercise-instrumentation,
  :form 1,
  :covered true,
  :text "  (if (= x 1)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (.
   clojure.lang.Numbers
   (add
    (cloverage.instrument/wrapm cloverage.coverage/track-coverage 60 x)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     60
     2))),
  :line 60,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (.
   clojure.lang.Numbers
   (add
    (cloverage.instrument/wrapm cloverage.coverage/track-coverage 60 x)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     60
     2))),
  :covered true,
  :text "    (+ x 2)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form x,
  :line 60,
  :lib cloverage.sample.exercise-instrumentation,
  :form x,
  :covered true,
  :text "    (+ x 2)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form 2,
  :line 60,
  :lib cloverage.sample.exercise-instrumentation,
  :form 2,
  :covered true,
  :text "    (+ x 2)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form
  (.
   clojure.lang.Numbers
   (minus
    (cloverage.instrument/wrapm cloverage.coverage/track-coverage 61 x)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     61
     2))),
  :line 61,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (.
   clojure.lang.Numbers
   (minus
    (cloverage.instrument/wrapm cloverage.coverage/track-coverage 61 x)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     61
     2))),
  :covered false,
  :text "    (- x 2)))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form x,
  :line 61,
  :lib cloverage.sample.exercise-instrumentation,
  :form x,
  :covered false,
  :text "    (- x 2)))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form 2,
  :line 61,
  :lib cloverage.sample.exercise-instrumentation,
  :form 2,
  :covered false,
  :text "    (- x 2)))"}
 {:text "",
  :line 62,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (.
   mixed-coverage-multi
   clojure.core/addMethod
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    63
    Character)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    63
    (clojure.core/fn [x] (str x)))),
  :line 63,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (.
   mixed-coverage-multi
   clojure.core/addMethod
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    63
    Character)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    63
    (clojure.core/fn [x] (str x)))),
  :covered true,
  :text "(defmethod mixed-coverage-multi Character"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form Character,
  :line 63,
  :lib cloverage.sample.exercise-instrumentation,
  :form Character,
  :covered true,
  :text "(defmethod mixed-coverage-multi Character"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (clojure.core/fn
   [x]
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    63
    (str x))),
  :line 63,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (clojure.core/fn
   [x]
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    63
    (str x))),
  :covered true,
  :text "(defmethod mixed-coverage-multi Character"}
 {:text "  ;; not covered",
  :line 64,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:text "  [x]",
  :line 65,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form
  ((cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    66
    str)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    66
    x)),
  :line 66,
  :lib cloverage.sample.exercise-instrumentation,
  :form (str x),
  :covered false,
  :text "  (str x))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form str,
  :line 66,
  :lib cloverage.sample.exercise-instrumentation,
  :form str,
  :covered false,
  :text "  (str x))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form x,
  :line 66,
  :lib cloverage.sample.exercise-instrumentation,
  :form x,
  :covered false,
  :text "  (str x))"}
 {:text "",
  :line 67,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (def
   test-mixed-multi
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    68
    (clojure.core/fn [] (clojure.test/test-var #'test-mixed-multi)))),
  :line 68,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (def
   test-mixed-multi
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    68
    (clojure.core/fn [] (clojure.test/test-var #'test-mixed-multi)))),
  :covered true,
  :text "(deftest test-mixed-multi"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (clojure.core/fn
   []
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    68
    (clojure.test/test-var #'test-mixed-multi))),
  :line 68,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (clojure.core/fn
   []
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    68
    (clojure.test/test-var #'test-mixed-multi))),
  :covered true,
  :text "(deftest test-mixed-multi"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form
  ((cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    68
    clojure.test/test-var)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    68
    #'test-mixed-multi)),
  :line 68,
  :lib cloverage.sample.exercise-instrumentation,
  :form (clojure.test/test-var #'test-mixed-multi),
  :covered false,
  :text "(deftest test-mixed-multi"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form clojure.test/test-var,
  :line 68,
  :lib cloverage.sample.exercise-instrumentation,
  :form clojure.test/test-var,
  :covered false,
  :text "(deftest test-mixed-multi"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form #'test-mixed-multi,
  :line 68,
  :lib cloverage.sample.exercise-instrumentation,
  :form #'test-mixed-multi,
  :covered false,
  :text "(deftest test-mixed-multi"}
 {:text "  (is \"String\" (mixed-coverage-multi \"String\"))",
  :line 69,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:text "  (is 3 (mixed-coverage-multi 1)))",
  :line 70,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:text "",
  :line 71,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (defmulti
   fully-covered-multi
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    72
    type)),
  :line 72,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (defmulti
   fully-covered-multi
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    72
    type)),
  :covered true,
  :text "(defmulti fully-covered-multi type)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form type,
  :line 72,
  :lib cloverage.sample.exercise-instrumentation,
  :form type,
  :covered true,
  :text "(defmulti fully-covered-multi type)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (.
   fully-covered-multi
   clojure.core/addMethod
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    73
    String)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    73
    (clojure.core/fn [x] x))),
  :line 73,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (.
   fully-covered-multi
   clojure.core/addMethod
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    73
    String)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    73
    (clojure.core/fn [x] x))),
  :covered true,
  :text "(defmethod fully-covered-multi String [x] x)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form String,
  :line 73,
  :lib cloverage.sample.exercise-instrumentation,
  :form String,
  :covered true,
  :text "(defmethod fully-covered-multi String [x] x)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (clojure.core/fn
   [x]
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    73
    x)),
  :line 73,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (clojure.core/fn
   [x]
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    73
    x)),
  :covered true,
  :text "(defmethod fully-covered-multi String [x] x)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form x,
  :line 73,
  :lib cloverage.sample.exercise-instrumentation,
  :form x,
  :covered true,
  :text "(defmethod fully-covered-multi String [x] x)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (.
   fully-covered-multi
   clojure.core/addMethod
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    74
    :default)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    74
    (clojure.core/fn [x] x))),
  :line 74,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (.
   fully-covered-multi
   clojure.core/addMethod
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    74
    :default)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    74
    (clojure.core/fn [x] x))),
  :covered true,
  :text "(defmethod fully-covered-multi :default [x] x)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form :default,
  :line 74,
  :lib cloverage.sample.exercise-instrumentation,
  :form :default,
  :covered true,
  :text "(defmethod fully-covered-multi :default [x] x)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (clojure.core/fn
   [x]
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    74
    x)),
  :line 74,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (clojure.core/fn
   [x]
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    74
    x)),
  :covered true,
  :text "(defmethod fully-covered-multi :default [x] x)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form x,
  :line 74,
  :lib cloverage.sample.exercise-instrumentation,
  :form x,
  :covered true,
  :text "(defmethod fully-covered-multi :default [x] x)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (def
   test-fully-covered-multi
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    75
    (clojure.core/fn
     []
     (clojure.test/test-var #'test-fully-covered-multi)))),
  :line 75,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (def
   test-fully-covered-multi
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    75
    (clojure.core/fn
     []
     (clojure.test/test-var #'test-fully-covered-multi)))),
  :covered true,
  :text "(deftest test-fully-covered-multi"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (clojure.core/fn
   []
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    75
    (clojure.test/test-var #'test-fully-covered-multi))),
  :line 75,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (clojure.core/fn
   []
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    75
    (clojure.test/test-var #'test-fully-covered-multi))),
  :covered true,
  :text "(deftest test-fully-covered-multi"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form
  ((cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    75
    clojure.test/test-var)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    75
    #'test-fully-covered-multi)),
  :line 75,
  :lib cloverage.sample.exercise-instrumentation,
  :form (clojure.test/test-var #'test-fully-covered-multi),
  :covered false,
  :text "(deftest test-fully-covered-multi"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form clojure.test/test-var,
  :line 75,
  :lib cloverage.sample.exercise-instrumentation,
  :form clojure.test/test-var,
  :covered false,
  :text "(deftest test-fully-covered-multi"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form #'test-fully-covered-multi,
  :line 75,
  :lib cloverage.sample.exercise-instrumentation,
  :form #'test-fully-covered-multi,
  :covered false,
  :text "(deftest test-fully-covered-multi"}
 {:text "  (is \"String\" (fully-covered-multi \"String\"))",
  :line 76,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:text "  (is 1 (fully-covered-multi 1)))",
  :line 77,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:text "",
  :line 78,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (def
   palindrome?
   (clojure.core/fn
    ([s]
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      79
      (if-not
       (vector? s)
       (palindrome? (vec s))
       (if
        (<= (count s) 1)
        true
        (and
         (= (s 0) (s (dec (count s))))
         (palindrome? (subvec s 1 (dec (count s))))))))))),
  :line 79,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (def
   palindrome?
   (clojure.core/fn
    ([s]
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      79
      (if-not
       (vector? s)
       (palindrome? (vec s))
       (if
        (<= (count s) 1)
        true
        (and
         (= (s 0) (s (dec (count s))))
         (palindrome? (subvec s 1 (dec (count s))))))))))),
  :covered true,
  :text "(defn palindrome?"}
 {:text "  \"Tests whether s is a palindrom.\"",
  :line 80,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:text "  ;; fully covered",
  :line 81,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:text "  [s]",
  :line 82,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 11,
  :full-form
  (if
   (cloverage.coverage/capture
    135
    ((cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      83
      clojure.core/not)
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      83
      (vector? s))))
   (cloverage.coverage/capture
    136
    ((cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      84
      palindrome?)
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      84
      (vec s))))
   (cloverage.coverage/capture
    137
    (if
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      85
      (. clojure.lang.Numbers (clojure.core/lte (count s) 1)))
     (cloverage.coverage/capture 146 true)
     (cloverage.coverage/capture
      147
      (clojure.core/let
       [and__5579__auto__
        (cloverage.instrument/wrapm
         cloverage.coverage/track-coverage
         87
         (= (s 0) (s (dec (count s)))))]
       (cloverage.instrument/wrapm
        cloverage.coverage/track-coverage
        87
        (if
         and__5579__auto__
         (clojure.core/and (palindrome? (subvec s 1 (dec (count s)))))
         and__5579__auto__))))))),
  :line 83,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (if
   (cloverage.coverage/capture
    135
    ((cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      83
      clojure.core/not)
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      83
      (vector? s))))
   (cloverage.coverage/capture
    136
    ((cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      84
      palindrome?)
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      84
      (vec s))))
   (cloverage.coverage/capture
    137
    (if
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      85
      (. clojure.lang.Numbers (clojure.core/lte (count s) 1)))
     (cloverage.coverage/capture 146 true)
     (cloverage.coverage/capture
      147
      (clojure.core/let
       [and__5579__auto__
        (cloverage.instrument/wrapm
         cloverage.coverage/track-coverage
         87
         (= (s 0) (s (dec (count s)))))]
       (cloverage.instrument/wrapm
        cloverage.coverage/track-coverage
        87
        (if
         and__5579__auto__
         (clojure.core/and (palindrome? (subvec s 1 (dec (count s)))))
         and__5579__auto__))))))),
  :covered true,
  :text "  (if-not (vector? s)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 11,
  :full-form
  ((cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    83
    clojure.core/not)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    83
    (vector? s))),
  :line 83,
  :lib cloverage.sample.exercise-instrumentation,
  :form (clojure.core/not (vector? s)),
  :covered true,
  :text "  (if-not (vector? s)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 11,
  :full-form clojure.core/not,
  :line 83,
  :lib cloverage.sample.exercise-instrumentation,
  :form clojure.core/not,
  :covered true,
  :text "  (if-not (vector? s)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 11,
  :full-form
  ((cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    83
    vector?)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    83
    s)),
  :line 83,
  :lib cloverage.sample.exercise-instrumentation,
  :form (vector? s),
  :covered true,
  :text "  (if-not (vector? s)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 11,
  :full-form vector?,
  :line 83,
  :lib cloverage.sample.exercise-instrumentation,
  :form vector?,
  :covered true,
  :text "  (if-not (vector? s)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 11,
  :full-form s,
  :line 83,
  :lib cloverage.sample.exercise-instrumentation,
  :form s,
  :covered true,
  :text "  (if-not (vector? s)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 3,
  :full-form
  ((cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    84
    palindrome?)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    84
    (vec s))),
  :line 84,
  :lib cloverage.sample.exercise-instrumentation,
  :form (palindrome? (vec s)),
  :covered true,
  :text "    (palindrome? (vec s))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 3,
  :full-form palindrome?,
  :line 84,
  :lib cloverage.sample.exercise-instrumentation,
  :form palindrome?,
  :covered true,
  :text "    (palindrome? (vec s))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 3,
  :full-form
  ((cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    84
    vec)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    84
    s)),
  :line 84,
  :lib cloverage.sample.exercise-instrumentation,
  :form (vec s),
  :covered true,
  :text "    (palindrome? (vec s))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 3,
  :full-form vec,
  :line 84,
  :lib cloverage.sample.exercise-instrumentation,
  :form vec,
  :covered true,
  :text "    (palindrome? (vec s))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 3,
  :full-form s,
  :line 84,
  :lib cloverage.sample.exercise-instrumentation,
  :form s,
  :covered true,
  :text "    (palindrome? (vec s))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 8,
  :full-form
  (if
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    85
    (. clojure.lang.Numbers (clojure.core/lte (count s) 1)))
   (cloverage.coverage/capture 146 true)
   (cloverage.coverage/capture
    147
    (clojure.core/let
     [and__5579__auto__
      (cloverage.instrument/wrapm
       cloverage.coverage/track-coverage
       87
       (= (s 0) (s (dec (count s)))))]
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      87
      (if
       and__5579__auto__
       (clojure.core/and (palindrome? (subvec s 1 (dec (count s)))))
       and__5579__auto__))))),
  :line 85,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (if
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    85
    (. clojure.lang.Numbers (clojure.core/lte (count s) 1)))
   (cloverage.coverage/capture 146 true)
   (cloverage.coverage/capture
    147
    (clojure.core/let
     [and__5579__auto__
      (cloverage.instrument/wrapm
       cloverage.coverage/track-coverage
       87
       (= (s 0) (s (dec (count s)))))]
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      87
      (if
       and__5579__auto__
       (clojure.core/and (palindrome? (subvec s 1 (dec (count s)))))
       and__5579__auto__))))),
  :covered true,
  :text "    (if (<= (count s) 1)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 2,
  :full-form true,
  :line 85,
  :lib cloverage.sample.exercise-instrumentation,
  :form true,
  :covered true,
  :text "    (if (<= (count s) 1)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 8,
  :full-form
  (.
   clojure.lang.Numbers
   (clojure.core/lte
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     85
     (count s))
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     85
     1))),
  :line 85,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (.
   clojure.lang.Numbers
   (clojure.core/lte
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     85
     (count s))
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     85
     1))),
  :covered true,
  :text "    (if (<= (count s) 1)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 8,
  :full-form
  (.
   clojure.lang.RT
   (clojure.core/count
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     85
     s))),
  :line 85,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (.
   clojure.lang.RT
   (clojure.core/count
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     85
     s))),
  :covered true,
  :text "    (if (<= (count s) 1)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 8,
  :full-form s,
  :line 85,
  :lib cloverage.sample.exercise-instrumentation,
  :form s,
  :covered true,
  :text "    (if (<= (count s) 1)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 8,
  :full-form 1,
  :line 85,
  :lib cloverage.sample.exercise-instrumentation,
  :form 1,
  :covered true,
  :text "    (if (<= (count s) 1)"}
 {:text "      true",
  :line 86,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 6,
  :full-form
  (clojure.core/let
   [and__5579__auto__
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     87
     (= (s 0) (s (dec (count s)))))]
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    87
    (if
     and__5579__auto__
     (clojure.core/and (palindrome? (subvec s 1 (dec (count s)))))
     and__5579__auto__))),
  :line 87,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (clojure.core/let
   [and__5579__auto__
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     87
     (= (s 0) (s (dec (count s)))))]
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    87
    (if
     and__5579__auto__
     (clojure.core/and (palindrome? (subvec s 1 (dec (count s)))))
     and__5579__auto__))),
  :covered true,
  :text "      (and (= (s 0) (s (dec (count s))))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 6,
  :full-form
  (.
   clojure.lang.Util
   clojure.core/equiv
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    87
    (s 0))
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    87
    (s (dec (count s))))),
  :line 87,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (.
   clojure.lang.Util
   clojure.core/equiv
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    87
    (s 0))
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    87
    (s (dec (count s))))),
  :covered true,
  :text "      (and (= (s 0) (s (dec (count s))))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 6,
  :full-form
  ((cloverage.instrument/wrapm cloverage.coverage/track-coverage 87 s)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    87
    0)),
  :line 87,
  :lib cloverage.sample.exercise-instrumentation,
  :form (s 0),
  :covered true,
  :text "      (and (= (s 0) (s (dec (count s))))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 6,
  :full-form s,
  :line 87,
  :lib cloverage.sample.exercise-instrumentation,
  :form s,
  :covered true,
  :text "      (and (= (s 0) (s (dec (count s))))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 6,
  :full-form 0,
  :line 87,
  :lib cloverage.sample.exercise-instrumentation,
  :form 0,
  :covered true,
  :text "      (and (= (s 0) (s (dec (count s))))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 6,
  :full-form
  ((cloverage.instrument/wrapm cloverage.coverage/track-coverage 87 s)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    87
    (dec (count s)))),
  :line 87,
  :lib cloverage.sample.exercise-instrumentation,
  :form (s (dec (count s))),
  :covered true,
  :text "      (and (= (s 0) (s (dec (count s))))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 6,
  :full-form s,
  :line 87,
  :lib cloverage.sample.exercise-instrumentation,
  :form s,
  :covered true,
  :text "      (and (= (s 0) (s (dec (count s))))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 6,
  :full-form
  (.
   clojure.lang.Numbers
   (dec
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     87
     (count s)))),
  :line 87,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (.
   clojure.lang.Numbers
   (dec
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     87
     (count s)))),
  :covered true,
  :text "      (and (= (s 0) (s (dec (count s))))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 6,
  :full-form
  (.
   clojure.lang.RT
   (clojure.core/count
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     87
     s))),
  :line 87,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (.
   clojure.lang.RT
   (clojure.core/count
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     87
     s))),
  :covered true,
  :text "      (and (= (s 0) (s (dec (count s))))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 6,
  :full-form s,
  :line 87,
  :lib cloverage.sample.exercise-instrumentation,
  :form s,
  :covered true,
  :text "      (and (= (s 0) (s (dec (count s))))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 6,
  :full-form
  (if
   (cloverage.coverage/capture 162 and__5579__auto__)
   (cloverage.coverage/capture
    163
    ((cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      87
      palindrome?)
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      87
      (subvec s 1 (dec (count s))))))
   (cloverage.coverage/capture 164 and__5579__auto__)),
  :line 87,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (if
   (cloverage.coverage/capture 162 and__5579__auto__)
   (cloverage.coverage/capture
    163
    ((cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      87
      palindrome?)
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      87
      (subvec s 1 (dec (count s))))))
   (cloverage.coverage/capture 164 and__5579__auto__)),
  :covered true,
  :text "      (and (= (s 0) (s (dec (count s))))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 6,
  :full-form and__5579__auto__,
  :line 87,
  :lib cloverage.sample.exercise-instrumentation,
  :form and__5579__auto__,
  :covered true,
  :text "      (and (= (s 0) (s (dec (count s))))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 5,
  :full-form
  ((cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    87
    palindrome?)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    87
    (subvec s 1 (dec (count s))))),
  :line 87,
  :lib cloverage.sample.exercise-instrumentation,
  :form (palindrome? (subvec s 1 (dec (count s)))),
  :covered true,
  :text "      (and (= (s 0) (s (dec (count s))))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form and__5579__auto__,
  :line 87,
  :lib cloverage.sample.exercise-instrumentation,
  :form and__5579__auto__,
  :covered true,
  :text "      (and (= (s 0) (s (dec (count s))))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 5,
  :full-form palindrome?,
  :line 88,
  :lib cloverage.sample.exercise-instrumentation,
  :form palindrome?,
  :covered true,
  :text "           (palindrome? (subvec s 1 (dec (count s))))))))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 5,
  :full-form
  ((cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    88
    subvec)
   (cloverage.instrument/wrapm cloverage.coverage/track-coverage 88 s)
   (cloverage.instrument/wrapm cloverage.coverage/track-coverage 88 1)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    88
    (dec (count s)))),
  :line 88,
  :lib cloverage.sample.exercise-instrumentation,
  :form (subvec s 1 (dec (count s))),
  :covered true,
  :text "           (palindrome? (subvec s 1 (dec (count s))))))))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 5,
  :full-form subvec,
  :line 88,
  :lib cloverage.sample.exercise-instrumentation,
  :form subvec,
  :covered true,
  :text "           (palindrome? (subvec s 1 (dec (count s))))))))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 5,
  :full-form s,
  :line 88,
  :lib cloverage.sample.exercise-instrumentation,
  :form s,
  :covered true,
  :text "           (palindrome? (subvec s 1 (dec (count s))))))))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 5,
  :full-form 1,
  :line 88,
  :lib cloverage.sample.exercise-instrumentation,
  :form 1,
  :covered true,
  :text "           (palindrome? (subvec s 1 (dec (count s))))))))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 5,
  :full-form
  (.
   clojure.lang.Numbers
   (dec
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     88
     (count s)))),
  :line 88,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (.
   clojure.lang.Numbers
   (dec
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     88
     (count s)))),
  :covered true,
  :text "           (palindrome? (subvec s 1 (dec (count s))))))))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 5,
  :full-form
  (.
   clojure.lang.RT
   (clojure.core/count
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     88
     s))),
  :line 88,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (.
   clojure.lang.RT
   (clojure.core/count
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     88
     s))),
  :covered true,
  :text "           (palindrome? (subvec s 1 (dec (count s))))))))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 5,
  :full-form s,
  :line 88,
  :lib cloverage.sample.exercise-instrumentation,
  :form s,
  :covered true,
  :text "           (palindrome? (subvec s 1 (dec (count s))))))))"}
 {:text "",
  :line 89,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (def
   test-palindrome
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    90
    (clojure.core/fn [] (clojure.test/test-var #'test-palindrome)))),
  :line 90,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (def
   test-palindrome
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    90
    (clojure.core/fn [] (clojure.test/test-var #'test-palindrome)))),
  :covered true,
  :text "(deftest test-palindrome"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (clojure.core/fn
   []
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    90
    (clojure.test/test-var #'test-palindrome))),
  :line 90,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (clojure.core/fn
   []
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    90
    (clojure.test/test-var #'test-palindrome))),
  :covered true,
  :text "(deftest test-palindrome"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form
  ((cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    90
    clojure.test/test-var)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    90
    #'test-palindrome)),
  :line 90,
  :lib cloverage.sample.exercise-instrumentation,
  :form (clojure.test/test-var #'test-palindrome),
  :covered false,
  :text "(deftest test-palindrome"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form clojure.test/test-var,
  :line 90,
  :lib cloverage.sample.exercise-instrumentation,
  :form clojure.test/test-var,
  :covered false,
  :text "(deftest test-palindrome"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form #'test-palindrome,
  :line 90,
  :lib cloverage.sample.exercise-instrumentation,
  :form #'test-palindrome,
  :covered false,
  :text "(deftest test-palindrome"}
 {:text "  ;; Palindrome is fully covered",
  :line 91,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:text "  (is (palindrome? \"noon\"))",
  :line 92,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:text "  (is (palindrome? \"racecar\"))",
  :line 93,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:text "  (is (not (palindrome? \"hello\"))))",
  :line 94,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:text "",
  :line 95,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (def
   permutation?
   (clojure.core/fn
    ([a b]
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      96
      (and
       (= (count a) (count b))
       (let
        [add-occurrence
         (fn [m c] (assoc m c (inc (m c 0))))
         a-counts
         (reduce add-occurrence {} a)
         b-counts
         (reduce add-occurrence {} b)]
        (= a-counts b-counts))))))),
  :line 96,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (def
   permutation?
   (clojure.core/fn
    ([a b]
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      96
      (and
       (= (count a) (count b))
       (let
        [add-occurrence
         (fn [m c] (assoc m c (inc (m c 0))))
         a-counts
         (reduce add-occurrence {} a)
         b-counts
         (reduce add-occurrence {} b)]
        (= a-counts b-counts))))))),
  :covered true,
  :text "(defn permutation?"}
 {:text "  \"Tests whether a and b are permutations of each other\"",
  :line 97,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:text "  [a b]",
  :line 98,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (clojure.core/let
   [and__5579__auto__
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     99
     (= (count a) (count b)))]
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    99
    (if
     and__5579__auto__
     (clojure.core/and
      (let
       [add-occurrence
        (fn [m c] (assoc m c (inc (m c 0))))
        a-counts
        (reduce add-occurrence {} a)
        b-counts
        (reduce add-occurrence {} b)]
       (= a-counts b-counts)))
     and__5579__auto__))),
  :line 99,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (clojure.core/let
   [and__5579__auto__
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     99
     (= (count a) (count b)))]
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    99
    (if
     and__5579__auto__
     (clojure.core/and
      (let
       [add-occurrence
        (fn [m c] (assoc m c (inc (m c 0))))
        a-counts
        (reduce add-occurrence {} a)
        b-counts
        (reduce add-occurrence {} b)]
       (= a-counts b-counts)))
     and__5579__auto__))),
  :covered true,
  :text "  (and (= (count a)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (.
   clojure.lang.Util
   clojure.core/equiv
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    99
    (count a))
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    99
    (count b))),
  :line 99,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (.
   clojure.lang.Util
   clojure.core/equiv
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    99
    (count a))
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    99
    (count b))),
  :covered true,
  :text "  (and (= (count a)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (.
   clojure.lang.RT
   (clojure.core/count
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     99
     a))),
  :line 99,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (.
   clojure.lang.RT
   (clojure.core/count
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     99
     a))),
  :covered true,
  :text "  (and (= (count a)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form a,
  :line 99,
  :lib cloverage.sample.exercise-instrumentation,
  :form a,
  :covered true,
  :text "  (and (= (count a)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (if
   (cloverage.coverage/capture 186 and__5579__auto__)
   (cloverage.coverage/capture
    187
    (let
     [add-occurrence
      (cloverage.instrument/wrapm
       cloverage.coverage/track-coverage
       99
       (fn [m c] (assoc m c (inc (m c 0)))))
      a-counts
      (cloverage.instrument/wrapm
       cloverage.coverage/track-coverage
       99
       (reduce add-occurrence {} a))
      b-counts
      (cloverage.instrument/wrapm
       cloverage.coverage/track-coverage
       99
       (reduce add-occurrence {} b))]
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      99
      (= a-counts b-counts))))
   (cloverage.coverage/capture 188 and__5579__auto__)),
  :line 99,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (if
   (cloverage.coverage/capture 186 and__5579__auto__)
   (cloverage.coverage/capture
    187
    (let
     [add-occurrence
      (cloverage.instrument/wrapm
       cloverage.coverage/track-coverage
       99
       (fn [m c] (assoc m c (inc (m c 0)))))
      a-counts
      (cloverage.instrument/wrapm
       cloverage.coverage/track-coverage
       99
       (reduce add-occurrence {} a))
      b-counts
      (cloverage.instrument/wrapm
       cloverage.coverage/track-coverage
       99
       (reduce add-occurrence {} b))]
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      99
      (= a-counts b-counts))))
   (cloverage.coverage/capture 188 and__5579__auto__)),
  :covered true,
  :text "  (and (= (count a)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form and__5579__auto__,
  :line 99,
  :lib cloverage.sample.exercise-instrumentation,
  :form and__5579__auto__,
  :covered true,
  :text "  (and (= (count a)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form
  (let
   [add-occurrence
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     99
     (fn [m c] (assoc m c (inc (m c 0)))))
    a-counts
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     99
     (reduce add-occurrence {} a))
    b-counts
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     99
     (reduce add-occurrence {} b))]
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    99
    (= a-counts b-counts))),
  :line 99,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (let
   [add-occurrence
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     99
     (fn [m c] (assoc m c (inc (m c 0)))))
    a-counts
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     99
     (reduce add-occurrence {} a))
    b-counts
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     99
     (reduce add-occurrence {} b))]
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    99
    (= a-counts b-counts))),
  :covered false,
  :text "  (and (= (count a)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form and__5579__auto__,
  :line 99,
  :lib cloverage.sample.exercise-instrumentation,
  :form and__5579__auto__,
  :covered true,
  :text "  (and (= (count a)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (.
   clojure.lang.RT
   (clojure.core/count
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     100
     b))),
  :line 100,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (.
   clojure.lang.RT
   (clojure.core/count
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     100
     b))),
  :covered true,
  :text "          (count b))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form b,
  :line 100,
  :lib cloverage.sample.exercise-instrumentation,
  :form b,
  :covered true,
  :text "          (count b))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form
  (fn
   [m c]
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    101
    (assoc m c (inc (m c 0))))),
  :line 101,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (fn
   [m c]
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    101
    (assoc m c (inc (m c 0))))),
  :covered false,
  :text
  "       (let [add-occurrence (fn [m c] (assoc m c (inc (m c 0))))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form
  ((cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    101
    assoc)
   (cloverage.instrument/wrapm cloverage.coverage/track-coverage 101 m)
   (cloverage.instrument/wrapm cloverage.coverage/track-coverage 101 c)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    101
    (inc (m c 0)))),
  :line 101,
  :lib cloverage.sample.exercise-instrumentation,
  :form (assoc m c (inc (m c 0))),
  :covered false,
  :text
  "       (let [add-occurrence (fn [m c] (assoc m c (inc (m c 0))))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form assoc,
  :line 101,
  :lib cloverage.sample.exercise-instrumentation,
  :form assoc,
  :covered false,
  :text
  "       (let [add-occurrence (fn [m c] (assoc m c (inc (m c 0))))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form m,
  :line 101,
  :lib cloverage.sample.exercise-instrumentation,
  :form m,
  :covered false,
  :text
  "       (let [add-occurrence (fn [m c] (assoc m c (inc (m c 0))))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form c,
  :line 101,
  :lib cloverage.sample.exercise-instrumentation,
  :form c,
  :covered false,
  :text
  "       (let [add-occurrence (fn [m c] (assoc m c (inc (m c 0))))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form
  (.
   clojure.lang.Numbers
   (inc
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     101
     (m c 0)))),
  :line 101,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (.
   clojure.lang.Numbers
   (inc
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     101
     (m c 0)))),
  :covered false,
  :text
  "       (let [add-occurrence (fn [m c] (assoc m c (inc (m c 0))))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form
  ((cloverage.instrument/wrapm cloverage.coverage/track-coverage 101 m)
   (cloverage.instrument/wrapm cloverage.coverage/track-coverage 101 c)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    101
    0)),
  :line 101,
  :lib cloverage.sample.exercise-instrumentation,
  :form (m c 0),
  :covered false,
  :text
  "       (let [add-occurrence (fn [m c] (assoc m c (inc (m c 0))))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form m,
  :line 101,
  :lib cloverage.sample.exercise-instrumentation,
  :form m,
  :covered false,
  :text
  "       (let [add-occurrence (fn [m c] (assoc m c (inc (m c 0))))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form c,
  :line 101,
  :lib cloverage.sample.exercise-instrumentation,
  :form c,
  :covered false,
  :text
  "       (let [add-occurrence (fn [m c] (assoc m c (inc (m c 0))))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form 0,
  :line 101,
  :lib cloverage.sample.exercise-instrumentation,
  :form 0,
  :covered false,
  :text
  "       (let [add-occurrence (fn [m c] (assoc m c (inc (m c 0))))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form
  ((cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    102
    reduce)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    102
    add-occurrence)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    102
    {})
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    102
    a)),
  :line 102,
  :lib cloverage.sample.exercise-instrumentation,
  :form (reduce add-occurrence {} a),
  :covered false,
  :text "             a-counts (reduce add-occurrence {} a)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form reduce,
  :line 102,
  :lib cloverage.sample.exercise-instrumentation,
  :form reduce,
  :covered false,
  :text "             a-counts (reduce add-occurrence {} a)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form add-occurrence,
  :line 102,
  :lib cloverage.sample.exercise-instrumentation,
  :form add-occurrence,
  :covered false,
  :text "             a-counts (reduce add-occurrence {} a)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form {},
  :line 102,
  :lib cloverage.sample.exercise-instrumentation,
  :form {},
  :covered false,
  :text "             a-counts (reduce add-occurrence {} a)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form a,
  :line 102,
  :lib cloverage.sample.exercise-instrumentation,
  :form a,
  :covered false,
  :text "             a-counts (reduce add-occurrence {} a)"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form
  ((cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    103
    reduce)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    103
    add-occurrence)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    103
    {})
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    103
    b)),
  :line 103,
  :lib cloverage.sample.exercise-instrumentation,
  :form (reduce add-occurrence {} b),
  :covered false,
  :text "             b-counts (reduce add-occurrence {} b)]"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form reduce,
  :line 103,
  :lib cloverage.sample.exercise-instrumentation,
  :form reduce,
  :covered false,
  :text "             b-counts (reduce add-occurrence {} b)]"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form add-occurrence,
  :line 103,
  :lib cloverage.sample.exercise-instrumentation,
  :form add-occurrence,
  :covered false,
  :text "             b-counts (reduce add-occurrence {} b)]"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form {},
  :line 103,
  :lib cloverage.sample.exercise-instrumentation,
  :form {},
  :covered false,
  :text "             b-counts (reduce add-occurrence {} b)]"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form b,
  :line 103,
  :lib cloverage.sample.exercise-instrumentation,
  :form b,
  :covered false,
  :text "             b-counts (reduce add-occurrence {} b)]"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form
  (.
   clojure.lang.Util
   clojure.core/equiv
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    104
    a-counts)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    104
    b-counts)),
  :line 104,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (.
   clojure.lang.Util
   clojure.core/equiv
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    104
    a-counts)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    104
    b-counts)),
  :covered false,
  :text "         (= a-counts b-counts))))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form a-counts,
  :line 104,
  :lib cloverage.sample.exercise-instrumentation,
  :form a-counts,
  :covered false,
  :text "         (= a-counts b-counts))))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form b-counts,
  :line 104,
  :lib cloverage.sample.exercise-instrumentation,
  :form b-counts,
  :covered false,
  :text "         (= a-counts b-counts))))"}
 {:text "",
  :line 105,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (def
   test-permutation
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    106
    (clojure.core/fn [] (clojure.test/test-var #'test-permutation)))),
  :line 106,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (def
   test-permutation
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    106
    (clojure.core/fn [] (clojure.test/test-var #'test-permutation)))),
  :covered true,
  :text "(deftest test-permutation"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (clojure.core/fn
   []
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    106
    (clojure.test/test-var #'test-permutation))),
  :line 106,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (clojure.core/fn
   []
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    106
    (clojure.test/test-var #'test-permutation))),
  :covered true,
  :text "(deftest test-permutation"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form
  ((cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    106
    clojure.test/test-var)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    106
    #'test-permutation)),
  :line 106,
  :lib cloverage.sample.exercise-instrumentation,
  :form (clojure.test/test-var #'test-permutation),
  :covered false,
  :text "(deftest test-permutation"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form clojure.test/test-var,
  :line 106,
  :lib cloverage.sample.exercise-instrumentation,
  :form clojure.test/test-var,
  :covered false,
  :text "(deftest test-permutation"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form #'test-permutation,
  :line 106,
  :lib cloverage.sample.exercise-instrumentation,
  :form #'test-permutation,
  :covered false,
  :text "(deftest test-permutation"}
 {:text "  ;; permutation is partially covered",
  :line 107,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:text "  (is (not (permutation? \"foo\" \"foobar\"))))",
  :line 108,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:text "",
  :line 109,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (def
   fully-covered-cond
   (clojure.core/fn
    ([n]
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      110
      (cond (zero? n) :zero :else :nonzero))))),
  :line 110,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (def
   fully-covered-cond
   (clojure.core/fn
    ([n]
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      110
      (cond (zero? n) :zero :else :nonzero))))),
  :covered true,
  :text "(defn fully-covered-cond"}
 {:text "  [n]",
  :line 111,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 2,
  :full-form
  (if
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    113
    (. clojure.lang.Numbers (clojure.core/isZero n)))
   (cloverage.coverage/capture 219 :zero)
   (cloverage.coverage/capture
    220
    (if
     :else
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      112
      :nonzero)
     (clojure.core/cond)))),
  :line 112,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (if
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    113
    (. clojure.lang.Numbers (clojure.core/isZero n)))
   (cloverage.coverage/capture 219 :zero)
   (cloverage.coverage/capture
    220
    (if
     :else
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      112
      :nonzero)
     (clojure.core/cond)))),
  :covered true,
  :text "  (cond"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form :zero,
  :line 112,
  :lib cloverage.sample.exercise-instrumentation,
  :form :zero,
  :covered true,
  :text "  (cond"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (if
   :else
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    112
    :nonzero)
   (clojure.core/cond)),
  :line 112,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (if
   :else
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    112
    :nonzero)
   (clojure.core/cond)),
  :covered true,
  :text "  (cond"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form :nonzero,
  :line 112,
  :lib cloverage.sample.exercise-instrumentation,
  :form :nonzero,
  :covered true,
  :text "  (cond"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 2,
  :full-form
  (.
   clojure.lang.Numbers
   (clojure.core/isZero
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     113
     n))),
  :line 113,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (.
   clojure.lang.Numbers
   (clojure.core/isZero
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     113
     n))),
  :covered true,
  :text "    (zero? n) :zero"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 2,
  :full-form n,
  :line 113,
  :lib cloverage.sample.exercise-instrumentation,
  :form n,
  :covered true,
  :text "    (zero? n) :zero"}
 {:text "    :else     :nonzero))",
  :line 114,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:text "",
  :line 115,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (def
   test-fully-covered-cond
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    116
    (clojure.core/fn
     []
     (clojure.test/test-var #'test-fully-covered-cond)))),
  :line 116,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (def
   test-fully-covered-cond
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    116
    (clojure.core/fn
     []
     (clojure.test/test-var #'test-fully-covered-cond)))),
  :covered true,
  :text "(deftest test-fully-covered-cond"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (clojure.core/fn
   []
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    116
    (clojure.test/test-var #'test-fully-covered-cond))),
  :line 116,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (clojure.core/fn
   []
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    116
    (clojure.test/test-var #'test-fully-covered-cond))),
  :covered true,
  :text "(deftest test-fully-covered-cond"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form
  ((cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    116
    clojure.test/test-var)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    116
    #'test-fully-covered-cond)),
  :line 116,
  :lib cloverage.sample.exercise-instrumentation,
  :form (clojure.test/test-var #'test-fully-covered-cond),
  :covered false,
  :text "(deftest test-fully-covered-cond"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form clojure.test/test-var,
  :line 116,
  :lib cloverage.sample.exercise-instrumentation,
  :form clojure.test/test-var,
  :covered false,
  :text "(deftest test-fully-covered-cond"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form #'test-fully-covered-cond,
  :line 116,
  :lib cloverage.sample.exercise-instrumentation,
  :form #'test-fully-covered-cond,
  :covered false,
  :text "(deftest test-fully-covered-cond"}
 {:text "  (is (= :zero (fully-covered-cond 0)))",
  :line 117,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:text "  (is (= :nonzero (fully-covered-cond 1))))",
  :line 118,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:text "",
  :line 119,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (def
   transaction-fn
   (clojure.core/fn
    ([n]
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      120
      (dosync
       (cond
        (zero? n)
        :zero
        :else
        (throw (RuntimeException. "FAIL TRANSACTION")))))))),
  :line 120,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (def
   transaction-fn
   (clojure.core/fn
    ([n]
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      120
      (dosync
       (cond
        (zero? n)
        :zero
        :else
        (throw (RuntimeException. "FAIL TRANSACTION")))))))),
  :covered true,
  :text "(defn transaction-fn"}
 {:text "  [n]",
  :line 121,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (.
   clojure.lang.LockingTransaction
   (clojure.core/runInTransaction
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     122
     (clojure.core/fn
      []
      (cond
       (zero? n)
       :zero
       :else
       (throw (RuntimeException. "FAIL TRANSACTION"))))))),
  :line 122,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (.
   clojure.lang.LockingTransaction
   (clojure.core/runInTransaction
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     122
     (clojure.core/fn
      []
      (cond
       (zero? n)
       :zero
       :else
       (throw (RuntimeException. "FAIL TRANSACTION"))))))),
  :covered true,
  :text "  (dosync"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (clojure.core/fn
   []
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    122
    (cond
     (zero? n)
     :zero
     :else
     (throw (RuntimeException. "FAIL TRANSACTION"))))),
  :line 122,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (clojure.core/fn
   []
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    122
    (cond
     (zero? n)
     :zero
     :else
     (throw (RuntimeException. "FAIL TRANSACTION"))))),
  :covered true,
  :text "  (dosync"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (if
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    124
    (. clojure.lang.Numbers (clojure.core/isZero n)))
   (cloverage.coverage/capture 233 :zero)
   (cloverage.coverage/capture
    234
    (if
     :else
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      123
      (throw (RuntimeException. "FAIL TRANSACTION")))
     (clojure.core/cond)))),
  :line 123,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (if
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    124
    (. clojure.lang.Numbers (clojure.core/isZero n)))
   (cloverage.coverage/capture 233 :zero)
   (cloverage.coverage/capture
    234
    (if
     :else
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      123
      (throw (RuntimeException. "FAIL TRANSACTION")))
     (clojure.core/cond)))),
  :covered true,
  :text "   (cond"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form :zero,
  :line 123,
  :lib cloverage.sample.exercise-instrumentation,
  :form :zero,
  :covered false,
  :text "   (cond"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (if
   :else
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    123
    (throw (RuntimeException. "FAIL TRANSACTION")))
   (clojure.core/cond)),
  :line 123,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (if
   :else
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    123
    (throw (RuntimeException. "FAIL TRANSACTION")))
   (clojure.core/cond)),
  :covered true,
  :text "   (cond"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (.
   clojure.lang.Numbers
   (clojure.core/isZero
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     124
     n))),
  :line 124,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (.
   clojure.lang.Numbers
   (clojure.core/isZero
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     124
     n))),
  :covered true,
  :text "     (zero? n) :zero"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form n,
  :line 124,
  :lib cloverage.sample.exercise-instrumentation,
  :form n,
  :covered true,
  :text "     (zero? n) :zero"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (throw
   (cloverage.coverage/capture
    238
    (new
     RuntimeException
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      125
      "FAIL TRANSACTION")))),
  :line 125,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (throw
   (cloverage.coverage/capture
    238
    (new
     RuntimeException
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      125
      "FAIL TRANSACTION")))),
  :covered true,
  :text
  "     :else     (throw (RuntimeException. \"FAIL TRANSACTION\")))))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (new
   RuntimeException
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    125
    "FAIL TRANSACTION")),
  :line 125,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (new
   RuntimeException
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    125
    "FAIL TRANSACTION")),
  :covered true,
  :text
  "     :else     (throw (RuntimeException. \"FAIL TRANSACTION\")))))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form "FAIL TRANSACTION",
  :line 125,
  :lib cloverage.sample.exercise-instrumentation,
  :form "FAIL TRANSACTION",
  :covered true,
  :text
  "     :else     (throw (RuntimeException. \"FAIL TRANSACTION\")))))"}
 {:text "",
  :line 126,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (def
   failing-transaction
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    127
    (clojure.core/fn
     []
     (clojure.test/test-var #'failing-transaction)))),
  :line 127,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (def
   failing-transaction
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    127
    (clojure.core/fn
     []
     (clojure.test/test-var #'failing-transaction)))),
  :covered true,
  :text "(deftest failing-transaction"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (clojure.core/fn
   []
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    127
    (clojure.test/test-var #'failing-transaction))),
  :line 127,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (clojure.core/fn
   []
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    127
    (clojure.test/test-var #'failing-transaction))),
  :covered true,
  :text "(deftest failing-transaction"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form
  ((cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    127
    clojure.test/test-var)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    127
    #'failing-transaction)),
  :line 127,
  :lib cloverage.sample.exercise-instrumentation,
  :form (clojure.test/test-var #'failing-transaction),
  :covered false,
  :text "(deftest failing-transaction"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form clojure.test/test-var,
  :line 127,
  :lib cloverage.sample.exercise-instrumentation,
  :form clojure.test/test-var,
  :covered false,
  :text "(deftest failing-transaction"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form #'failing-transaction,
  :line 127,
  :lib cloverage.sample.exercise-instrumentation,
  :form #'failing-transaction,
  :covered false,
  :text "(deftest failing-transaction"}
 {:text "  (is (thrown? Exception (transaction-fn 1))))",
  :line 128,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:text "",
  :line 129,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (letfn*
   [covered
    (clojure.core/fn
     covered
     []
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      130
      (+ 2 3)))
    not-covered
    (clojure.core/fn
     not-covered
     []
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      131
      {:and :not-tracked}))
    not-covered
    (clojure.core/fn
     not-covered
     []
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      132
      ({:preimage :image} :preimage)))]
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    130
    (covered))),
  :line 130,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (letfn*
   [covered
    (clojure.core/fn
     covered
     []
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      130
      (+ 2 3)))
    not-covered
    (clojure.core/fn
     not-covered
     []
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      131
      {:and :not-tracked}))
    not-covered
    (clojure.core/fn
     not-covered
     []
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      132
      ({:preimage :image} :preimage)))]
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    130
    (covered))),
  :covered true,
  :text "(letfn [(covered [] (+ 2 3))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (.
   clojure.lang.Numbers
   (add
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     130
     2)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     130
     3))),
  :line 130,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (.
   clojure.lang.Numbers
   (add
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     130
     2)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     130
     3))),
  :covered true,
  :text "(letfn [(covered [] (+ 2 3))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form 2,
  :line 130,
  :lib cloverage.sample.exercise-instrumentation,
  :form 2,
  :covered true,
  :text "(letfn [(covered [] (+ 2 3))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form 3,
  :line 130,
  :lib cloverage.sample.exercise-instrumentation,
  :form 3,
  :covered true,
  :text "(letfn [(covered [] (+ 2 3))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form
  {(cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    131
    :and)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    131
    :not-tracked)},
  :line 131,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  {(cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    131
    :and)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    131
    :not-tracked)},
  :covered false,
  :text "        (not-covered [] {:and :not-tracked})"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form :and,
  :line 131,
  :lib cloverage.sample.exercise-instrumentation,
  :form :and,
  :covered false,
  :text "        (not-covered [] {:and :not-tracked})"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form :not-tracked,
  :line 131,
  :lib cloverage.sample.exercise-instrumentation,
  :form :not-tracked,
  :covered false,
  :text "        (not-covered [] {:and :not-tracked})"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form
  ((cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    132
    {:preimage :image})
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    132
    :preimage)),
  :line 132,
  :lib cloverage.sample.exercise-instrumentation,
  :form ({:preimage :image} :preimage),
  :covered false,
  :text "        (not-covered [] ({:preimage :image} :preimage))]"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form
  {(cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    132
    :preimage)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    132
    :image)},
  :line 132,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  {(cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    132
    :preimage)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    132
    :image)},
  :covered false,
  :text "        (not-covered [] ({:preimage :image} :preimage))]"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form :preimage,
  :line 132,
  :lib cloverage.sample.exercise-instrumentation,
  :form :preimage,
  :covered false,
  :text "        (not-covered [] ({:preimage :image} :preimage))]"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form :image,
  :line 132,
  :lib cloverage.sample.exercise-instrumentation,
  :form :image,
  :covered false,
  :text "        (not-covered [] ({:preimage :image} :preimage))]"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form :preimage,
  :line 132,
  :lib cloverage.sample.exercise-instrumentation,
  :form :preimage,
  :covered false,
  :text "        (not-covered [] ({:preimage :image} :preimage))]"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  ((cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    133
    covered)),
  :line 133,
  :lib cloverage.sample.exercise-instrumentation,
  :form (covered),
  :covered true,
  :text "  (covered))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form covered,
  :line 133,
  :lib cloverage.sample.exercise-instrumentation,
  :form covered,
  :covered true,
  :text "  (covered))"}
 {:text "",
  :line 134,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (def
   loop
   (clojure.core/fn
    ([n]
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      135
      (+ n n))))),
  :line 135,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (def
   loop
   (clojure.core/fn
    ([n]
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      135
      (+ n n))))),
  :covered true,
  :text "(defn loop \"Not really loop.\""}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form
  (.
   clojure.lang.Numbers
   (add
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     136
     n)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     136
     n))),
  :line 136,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (.
   clojure.lang.Numbers
   (add
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     136
     n)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     136
     n))),
  :covered false,
  :text "  [n] (+ n n))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form n,
  :line 136,
  :lib cloverage.sample.exercise-instrumentation,
  :form n,
  :covered false,
  :text "  [n] (+ n n))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form n,
  :line 136,
  :lib cloverage.sample.exercise-instrumentation,
  :form n,
  :covered false,
  :text "  [n] (+ n n))"}
 {:text "",
  :line 137,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (def
   global-loop-shouldnt-crash
   (clojure.core/fn
    ([]
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      138
      (loop 3))))),
  :line 138,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (def
   global-loop-shouldnt-crash
   (clojure.core/fn
    ([]
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      138
      (loop 3))))),
  :covered true,
  :text "(defn global-loop-shouldnt-crash []"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form
  ((cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    139
    loop)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    139
    3)),
  :line 139,
  :lib cloverage.sample.exercise-instrumentation,
  :form (loop 3),
  :covered false,
  :text "  (loop 3))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form loop,
  :line 139,
  :lib cloverage.sample.exercise-instrumentation,
  :form loop,
  :covered false,
  :text "  (loop 3))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form 3,
  :line 139,
  :lib cloverage.sample.exercise-instrumentation,
  :form 3,
  :covered false,
  :text "  (loop 3))"}
 {:text "",
  :line 140,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:text ";; top-level propagate-line-numbers broke preconditions",
  :line 141,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (def
   make-matrix
   (clojure.core/fn
    ([data ncol]
     {:pre
      [(cloverage.instrument/wrapm
        cloverage.coverage/track-coverage
        143
        true)]}
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      143
      :ok)))),
  :line 142,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (def
   make-matrix
   (clojure.core/fn
    ([data ncol]
     {:pre
      [(cloverage.instrument/wrapm
        cloverage.coverage/track-coverage
        143
        true)]}
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      143
      :ok)))),
  :covered true,
  :text "(defn make-matrix"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form true,
  :line 143,
  :lib cloverage.sample.exercise-instrumentation,
  :form true,
  :covered false,
  :text "  ([data ncol]"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form :ok,
  :line 143,
  :lib cloverage.sample.exercise-instrumentation,
  :form :ok,
  :covered false,
  :text "  ([data ncol]"}
 {:text "   {:pre [true]}",
  :line 144,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:text "   :ok))",
  :line 145,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:text "",
  :line 146,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (def
   locals-dont-crash
   (clojure.core/fn
    ([]
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      147
      (let [letfn (fn* [p1__9825#] (+ p1__9825# 42))] (letfn 2)))))),
  :line 147,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (def
   locals-dont-crash
   (clojure.core/fn
    ([]
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      147
      (let [letfn (fn* [p1__9825#] (+ p1__9825# 42))] (letfn 2)))))),
  :covered true,
  :text "(defn locals-dont-crash []"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form
  (let
   [letfn
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     148
     (fn* [p1__9825#] (+ p1__9825# 42)))]
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    148
    (letfn 2))),
  :line 148,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (let
   [letfn
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     148
     (fn* [p1__9825#] (+ p1__9825# 42)))]
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    148
    (letfn 2))),
  :covered false,
  :text "  (let [letfn #(+ % 42)]"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form
  (fn*
   [p1__9825#]
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    148
    (+ p1__9825# 42))),
  :line 148,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (fn*
   [p1__9825#]
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    148
    (+ p1__9825# 42))),
  :covered false,
  :text "  (let [letfn #(+ % 42)]"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form
  (.
   clojure.lang.Numbers
   (add
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     148
     p1__9825#)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     148
     42))),
  :line 148,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (.
   clojure.lang.Numbers
   (add
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     148
     p1__9825#)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     148
     42))),
  :covered false,
  :text "  (let [letfn #(+ % 42)]"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form p1__9825#,
  :line 148,
  :lib cloverage.sample.exercise-instrumentation,
  :form p1__9825#,
  :covered false,
  :text "  (let [letfn #(+ % 42)]"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form 42,
  :line 148,
  :lib cloverage.sample.exercise-instrumentation,
  :form 42,
  :covered false,
  :text "  (let [letfn #(+ % 42)]"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form
  ((cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    149
    letfn)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    149
    2)),
  :line 149,
  :lib cloverage.sample.exercise-instrumentation,
  :form (letfn 2),
  :covered false,
  :text "    (letfn 2)))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form letfn,
  :line 149,
  :lib cloverage.sample.exercise-instrumentation,
  :form letfn,
  :covered false,
  :text "    (letfn 2)))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form 2,
  :line 149,
  :lib cloverage.sample.exercise-instrumentation,
  :form 2,
  :covered false,
  :text "    (letfn 2)))"}
 {:text "",
  :line 150,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (def
   inline-use
   (clojure.core/fn
    ([]
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      151
      (bytes (byte-array (map byte [1 2]))))))),
  :line 151,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (def
   inline-use
   (clojure.core/fn
    ([]
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      151
      (bytes (byte-array (map byte [1 2]))))))),
  :covered true,
  :text "(defn inline-use []"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (.
   clojure.lang.Numbers
   clojure.core/byte_array
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    152
    (map byte [1 2]))),
  :line 152,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (.
   clojure.lang.Numbers
   clojure.core/byte_array
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    152
    (map byte [1 2]))),
  :covered true,
  :text "  (bytes (byte-array (map byte [1 2]))))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  ((cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    152
    map)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    152
    byte)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    152
    [1 2])),
  :line 152,
  :lib cloverage.sample.exercise-instrumentation,
  :form (map byte [1 2]),
  :covered true,
  :text "  (bytes (byte-array (map byte [1 2]))))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form map,
  :line 152,
  :lib cloverage.sample.exercise-instrumentation,
  :form map,
  :covered true,
  :text "  (bytes (byte-array (map byte [1 2]))))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form byte,
  :line 152,
  :lib cloverage.sample.exercise-instrumentation,
  :form byte,
  :covered true,
  :text "  (bytes (byte-array (map byte [1 2]))))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  [(cloverage.instrument/wrapm cloverage.coverage/track-coverage 152 1)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    152
    2)],
  :line 152,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  [(cloverage.instrument/wrapm cloverage.coverage/track-coverage 152 1)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    152
    2)],
  :covered true,
  :text "  (bytes (byte-array (map byte [1 2]))))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form 1,
  :line 152,
  :lib cloverage.sample.exercise-instrumentation,
  :form 1,
  :covered true,
  :text "  (bytes (byte-array (map byte [1 2]))))"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form 2,
  :line 152,
  :lib cloverage.sample.exercise-instrumentation,
  :form 2,
  :covered true,
  :text "  (bytes (byte-array (map byte [1 2]))))"}
 {:text "",
  :line 153,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (def
   CLJ-1330-workaround
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    154
    (clojure.core/fn
     []
     (clojure.test/test-var #'CLJ-1330-workaround)))),
  :line 154,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (def
   CLJ-1330-workaround
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    154
    (clojure.core/fn
     []
     (clojure.test/test-var #'CLJ-1330-workaround)))),
  :covered true,
  :text "(deftest CLJ-1330-workaround []"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1,
  :full-form
  (clojure.core/fn
   []
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    154
    (clojure.test/test-var #'CLJ-1330-workaround))),
  :line 154,
  :lib cloverage.sample.exercise-instrumentation,
  :form
  (clojure.core/fn
   []
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    154
    (clojure.test/test-var #'CLJ-1330-workaround))),
  :covered true,
  :text "(deftest CLJ-1330-workaround []"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form
  ((cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    154
    clojure.test/test-var)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    154
    #'CLJ-1330-workaround)),
  :line 154,
  :lib cloverage.sample.exercise-instrumentation,
  :form (clojure.test/test-var #'CLJ-1330-workaround),
  :covered false,
  :text "(deftest CLJ-1330-workaround []"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form clojure.test/test-var,
  :line 154,
  :lib cloverage.sample.exercise-instrumentation,
  :form clojure.test/test-var,
  :covered false,
  :text "(deftest CLJ-1330-workaround []"}
 {:tracked true,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0,
  :full-form #'CLJ-1330-workaround,
  :line 154,
  :lib cloverage.sample.exercise-instrumentation,
  :form #'CLJ-1330-workaround,
  :covered false,
  :text "(deftest CLJ-1330-workaround []"}
 {:text "  (is (not= (type (inline-use))",
  :line 155,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"}
 {:text "            clojure.lang.Cons)))",
  :line 156,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj"})
