{0
 {:form
  (ns
   cloverage.sample.exercise-instrumentation
   (:refer-clojure :exclude [loop])
   (:import java.lang.RuntimeException)
   (:require [clojure.test :refer :all])),
  :full-form
  (ns
   cloverage.sample.exercise-instrumentation
   (:refer-clojure :exclude [loop])
   (:import java.lang.RuntimeException)
   (:require [clojure.test :refer :all])),
  :tracked true,
  :line 1,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 275
 {:form 42,
  :full-form 42,
  :tracked true,
  :line 148,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 291
 {:form #'CLJ-1330-workaround,
  :full-form #'CLJ-1330-workaround,
  :tracked true,
  :line 154,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 249
 {:form
  {(cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    131
    :and)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    131
    :not-tracked)},
  :full-form
  {(cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    131
    :and)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    131
    :not-tracked)},
  :tracked true,
  :line 131,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 121
 {:form String,
  :full-form String,
  :tracked true,
  :line 73,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 287
 {:form
  (def
   CLJ-1330-workaround
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    154
    (clojure.core/fn
     []
     (clojure.test/test-var #'CLJ-1330-workaround)))),
  :full-form
  (def
   CLJ-1330-workaround
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    154
    (clojure.core/fn
     []
     (clojure.test/test-var #'CLJ-1330-workaround)))),
  :tracked true,
  :line 154,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 65
 {:form #'test-partially-covered,
  :full-form #'test-partially-covered,
  :tracked true,
  :line 38,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 70
 {:form
  (.
   clojure.lang.Numbers
   (add
    (cloverage.instrument/wrapm cloverage.coverage/track-coverage 42 1)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     42
     2))),
  :full-form
  (.
   clojure.lang.Numbers
   (add
    (cloverage.instrument/wrapm cloverage.coverage/track-coverage 42 1)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     42
     2))),
  :tracked true,
  :line 42,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 218
 {:form
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
  :tracked true,
  :line 112,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 2},
 62
 {:form
  (clojure.core/fn
   []
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    38
    (clojure.test/test-var #'test-partially-covered))),
  :full-form
  (clojure.core/fn
   []
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    38
    (clojure.test/test-var #'test-partially-covered))),
  :tracked true,
  :line 38,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 74
 {:form
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
  :tracked true,
  :line 42,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 164
 {:form and__5579__auto__,
  :full-form and__5579__auto__,
  :tracked true,
  :line 87,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 282
 {:form map,
  :full-form map,
  :tracked true,
  :line 152,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 273
 {:form
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
  :tracked true,
  :line 148,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 186
 {:form and__5579__auto__,
  :full-form and__5579__auto__,
  :tracked true,
  :line 99,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 233
 {:form :zero,
  :full-form :zero,
  :tracked true,
  :line 123,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 188
 {:form and__5579__auto__,
  :full-form and__5579__auto__,
  :tracked true,
  :line 99,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 240
 {:form
  (def
   failing-transaction
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    127
    (clojure.core/fn
     []
     (clojure.test/test-var #'failing-transaction)))),
  :full-form
  (def
   failing-transaction
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    127
    (clojure.core/fn
     []
     (clojure.test/test-var #'failing-transaction)))),
  :tracked true,
  :line 127,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 110
 {:form (str x),
  :full-form
  ((cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    66
    str)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    66
    x)),
  :tracked true,
  :line 66,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 130
 {:form (clojure.test/test-var #'test-fully-covered-multi),
  :full-form
  ((cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    75
    clojure.test/test-var)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    75
    #'test-fully-covered-multi)),
  :tracked true,
  :line 75,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 128
 {:form
  (def
   test-fully-covered-multi
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    75
    (clojure.core/fn
     []
     (clojure.test/test-var #'test-fully-covered-multi)))),
  :full-form
  (def
   test-fully-covered-multi
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    75
    (clojure.core/fn
     []
     (clojure.test/test-var #'test-fully-covered-multi)))),
  :tracked true,
  :line 75,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 259
 {:form
  (def
   loop
   (clojure.core/fn
    ([n]
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      135
      (+ n n))))),
  :full-form
  (def
   loop
   (clojure.core/fn
    ([n]
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      135
      (+ n n))))),
  :tracked true,
  :line 135,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 210
 {:form a-counts,
  :full-form a-counts,
  :tracked true,
  :line 104,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 229
 {:form
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
  :tracked true,
  :line 120,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 153
 {:form (s 0),
  :full-form
  ((cloverage.instrument/wrapm cloverage.coverage/track-coverage 87 s)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    87
    0)),
  :tracked true,
  :line 87,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 6},
 213
 {:form
  (clojure.core/fn
   []
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    106
    (clojure.test/test-var #'test-permutation))),
  :full-form
  (clojure.core/fn
   []
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    106
    (clojure.test/test-var #'test-permutation))),
  :tracked true,
  :line 106,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 7
 {:form 2,
  :full-form 2,
  :tracked true,
  :line 10,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 59
 {:form 3,
  :full-form 3,
  :tracked true,
  :line 36,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 86
 {:form
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
  :tracked true,
  :line 50,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 154
 {:form s,
  :full-form s,
  :tracked true,
  :line 87,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 6},
 20
 {:form
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
  :tracked true,
  :line 17,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 224
 {:form
  (def
   test-fully-covered-cond
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    116
    (clojure.core/fn
     []
     (clojure.test/test-var #'test-fully-covered-cond)))),
  :full-form
  (def
   test-fully-covered-cond
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    116
    (clojure.core/fn
     []
     (clojure.test/test-var #'test-fully-covered-cond)))),
  :tracked true,
  :line 116,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 72
 {:form 2,
  :full-form 2,
  :tracked true,
  :line 42,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 58
 {:form 2,
  :full-form 2,
  :tracked true,
  :line 36,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 205
 {:form reduce,
  :full-form reduce,
  :tracked true,
  :line 103,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 60
 {:form 4,
  :full-form 4,
  :tracked true,
  :line 36,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 175
 {:form (clojure.test/test-var #'test-palindrome),
  :full-form
  ((cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    90
    clojure.test/test-var)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    90
    #'test-palindrome)),
  :tracked true,
  :line 90,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 27
 {:form
  (.
   clojure.lang.Numbers
   (multiply
    (cloverage.instrument/wrapm cloverage.coverage/track-coverage 19 a)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     19
     b))),
  :full-form
  (.
   clojure.lang.Numbers
   (multiply
    (cloverage.instrument/wrapm cloverage.coverage/track-coverage 19 a)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     19
     b))),
  :tracked true,
  :line 19,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 1
 {:form '(),
  :full-form '(),
  :tracked true,
  :line nil,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 69
 {:form
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
  :tracked true,
  :line 42,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 101
 {:form
  (.
   clojure.lang.Numbers
   (add
    (cloverage.instrument/wrapm cloverage.coverage/track-coverage 60 x)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     60
     2))),
  :full-form
  (.
   clojure.lang.Numbers
   (add
    (cloverage.instrument/wrapm cloverage.coverage/track-coverage 60 x)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     60
     2))),
  :tracked true,
  :line 60,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 24
 {:form
  (.
   clojure.lang.Numbers
   (add
    (cloverage.instrument/wrapm cloverage.coverage/track-coverage 18 3)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     18
     4))),
  :full-form
  (.
   clojure.lang.Numbers
   (add
    (cloverage.instrument/wrapm cloverage.coverage/track-coverage 18 3)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     18
     4))),
  :tracked true,
  :line 18,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 102
 {:form x,
  :full-form x,
  :tracked true,
  :line 60,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 135
 {:form (clojure.core/not (vector? s)),
  :full-form
  ((cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    83
    clojure.core/not)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    83
    (vector? s))),
  :tracked true,
  :line 83,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 11},
 55
 {:form 3,
  :full-form 3,
  :tracked true,
  :line 36,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 269
 {:form :ok,
  :full-form :ok,
  :tracked true,
  :line 143,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 206
 {:form add-occurrence,
  :full-form add-occurrence,
  :tracked true,
  :line 103,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 165
 {:form palindrome?,
  :full-form palindrome?,
  :tracked true,
  :line 88,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 5},
 85
 {:form type,
  :full-form type,
  :tracked true,
  :line 48,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 225
 {:form
  (clojure.core/fn
   []
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    116
    (clojure.test/test-var #'test-fully-covered-cond))),
  :full-form
  (clojure.core/fn
   []
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    116
    (clojure.test/test-var #'test-fully-covered-cond))),
  :tracked true,
  :line 116,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 39
 {:form
  (def
   function-with-empty-list
   (clojure.core/fn
    ([]
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      24
      '())))),
  :full-form
  (def
   function-with-empty-list
   (clojure.core/fn
    ([]
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      24
      '())))),
  :tracked true,
  :line 24,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 274
 {:form p1__9825#,
  :full-form p1__9825#,
  :tracked true,
  :line 148,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 88
 {:form
  (clojure.core/fn
   [x]
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    50
    (do ((fn* [] ())) x))),
  :full-form
  (clojure.core/fn
   [x]
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    50
    (do ((fn* [] ())) x))),
  :tracked true,
  :line 50,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 217
 {:form
  (def
   fully-covered-cond
   (clojure.core/fn
    ([n]
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      110
      (cond (zero? n) :zero :else :nonzero))))),
  :full-form
  (def
   fully-covered-cond
   (clojure.core/fn
    ([n]
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      110
      (cond (zero? n) :zero :else :nonzero))))),
  :tracked true,
  :line 110,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 46
 {:form 2,
  :full-form 2,
  :tracked true,
  :line 32,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 149
 {:form
  (.
   clojure.lang.RT
   (clojure.core/count
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     85
     s))),
  :full-form
  (.
   clojure.lang.RT
   (clojure.core/count
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     85
     s))),
  :tracked true,
  :line 85,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 8},
 239
 {:form "FAIL TRANSACTION",
  :full-form "FAIL TRANSACTION",
  :tracked true,
  :line 125,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 157
 {:form s,
  :full-form s,
  :tracked true,
  :line 87,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 6},
 4
 {:form 40,
  :full-form 40,
  :tracked true,
  :line 8,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 204
 {:form (reduce add-occurrence {} b),
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
  :tracked true,
  :line 103,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 77
 {:form 5,
  :full-form 5,
  :tracked true,
  :line 42,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 106
 {:form 2,
  :full-form 2,
  :tracked true,
  :line 61,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 197
 {:form c,
  :full-form c,
  :tracked true,
  :line 101,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 232
 {:form
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
  :tracked true,
  :line 123,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 260
 {:form
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
  :tracked true,
  :line 136,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 267
 {:form
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
  :tracked true,
  :line 142,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 119
 {:form type,
  :full-form type,
  :tracked true,
  :line 72,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 222
 {:form n,
  :full-form n,
  :tracked true,
  :line 113,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 2},
 95
 {:form Long,
  :full-form Long,
  :tracked true,
  :line 56,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 144
 {:form vec,
  :full-form vec,
  :tracked true,
  :line 84,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 3},
 176
 {:form clojure.test/test-var,
  :full-form clojure.test/test-var,
  :tracked true,
  :line 90,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 192
 {:form m,
  :full-form m,
  :tracked true,
  :line 101,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 54
 {:form 2,
  :full-form 2,
  :tracked true,
  :line 36,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 92
 {:form
  (fn*
   []
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    53
    ())),
  :full-form
  (fn*
   []
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    53
    ())),
  :tracked true,
  :line 53,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 221
 {:form
  (.
   clojure.lang.Numbers
   (clojure.core/isZero
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     113
     n))),
  :full-form
  (.
   clojure.lang.Numbers
   (clojure.core/isZero
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     113
     n))),
  :tracked true,
  :line 113,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 2},
 141
 {:form s,
  :full-form s,
  :tracked true,
  :line 83,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 11},
 290
 {:form clojure.test/test-var,
  :full-form clojure.test/test-var,
  :tracked true,
  :line 154,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 264
 {:form (loop 3),
  :full-form
  ((cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    139
    loop)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    139
    3)),
  :tracked true,
  :line 139,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 137
 {:form
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
  :tracked true,
  :line 85,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 8},
 234
 {:form
  (if
   :else
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    123
    (throw (RuntimeException. "FAIL TRANSACTION")))
   (clojure.core/cond)),
  :full-form
  (if
   :else
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    123
    (throw (RuntimeException. "FAIL TRANSACTION")))
   (clojure.core/cond)),
  :tracked true,
  :line 123,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 104
 {:form
  (.
   clojure.lang.Numbers
   (minus
    (cloverage.instrument/wrapm cloverage.coverage/track-coverage 61 x)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     61
     2))),
  :full-form
  (.
   clojure.lang.Numbers
   (minus
    (cloverage.instrument/wrapm cloverage.coverage/track-coverage 61 x)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     61
     2))),
  :tracked true,
  :line 61,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 15
 {:form 2,
  :full-form 2,
  :tracked true,
  :line 14,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 48
 {:form
  (def
   partially-covered
   (clojure.core/fn
    ([cnd]
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      34
      (if cnd (+ 1 2 3) (- 2 3 4)))))),
  :full-form
  (def
   partially-covered
   (clojure.core/fn
    ([cnd]
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      34
      (if cnd (+ 1 2 3) (- 2 3 4)))))),
  :tracked true,
  :line 34,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 242
 {:form (clojure.test/test-var #'failing-transaction),
  :full-form
  ((cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    127
    clojure.test/test-var)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    127
    #'failing-transaction)),
  :tracked true,
  :line 127,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 50
 {:form cnd,
  :full-form cnd,
  :tracked true,
  :line 36,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 251
 {:form :not-tracked,
  :full-form :not-tracked,
  :tracked true,
  :line 131,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 116
 {:form clojure.test/test-var,
  :full-form clojure.test/test-var,
  :tracked true,
  :line 68,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 75
 {:form
  (.
   clojure.lang.Numbers
   (minus
    (cloverage.instrument/wrapm cloverage.coverage/track-coverage 42 4)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     42
     5))),
  :full-form
  (.
   clojure.lang.Numbers
   (minus
    (cloverage.instrument/wrapm cloverage.coverage/track-coverage 42 4)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     42
     5))),
  :tracked true,
  :line 42,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 159
 {:form
  (.
   clojure.lang.RT
   (clojure.core/count
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     87
     s))),
  :full-form
  (.
   clojure.lang.RT
   (clojure.core/count
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     87
     s))),
  :tracked true,
  :line 87,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 6},
 99
 {:form x,
  :full-form x,
  :tracked true,
  :line 59,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 281
 {:form (map byte [1 2]),
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
  :tracked true,
  :line 152,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 21
 {:form
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
  :tracked true,
  :line 17,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 31
 {:form :a,
  :full-form :a,
  :tracked true,
  :line 21,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 113
 {:form
  (def
   test-mixed-multi
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    68
    (clojure.core/fn [] (clojure.test/test-var #'test-mixed-multi)))),
  :full-form
  (def
   test-mixed-multi
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    68
    (clojure.core/fn [] (clojure.test/test-var #'test-mixed-multi)))),
  :tracked true,
  :line 68,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 32
 {:form
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
  :tracked true,
  :line 21,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 136
 {:form (palindrome? (vec s)),
  :full-form
  ((cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    84
    palindrome?)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    84
    (vec s))),
  :tracked true,
  :line 84,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 3},
 139
 {:form (vector? s),
  :full-form
  ((cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    83
    vector?)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    83
    s)),
  :tracked true,
  :line 83,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 11},
 174
 {:form
  (clojure.core/fn
   []
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    90
    (clojure.test/test-var #'test-palindrome))),
  :full-form
  (clojure.core/fn
   []
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    90
    (clojure.test/test-var #'test-palindrome))),
  :tracked true,
  :line 90,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 284
 {:form
  [(cloverage.instrument/wrapm cloverage.coverage/track-coverage 152 1)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    152
    2)],
  :full-form
  [(cloverage.instrument/wrapm cloverage.coverage/track-coverage 152 1)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    152
    2)],
  :tracked true,
  :line 152,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 208
 {:form b,
  :full-form b,
  :tracked true,
  :line 103,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 182
 {:form a,
  :full-form a,
  :tracked true,
  :line 99,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 256
 {:form :preimage,
  :full-form :preimage,
  :tracked true,
  :line 132,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 214
 {:form (clojure.test/test-var #'test-permutation),
  :full-form
  ((cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    106
    clojure.test/test-var)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    106
    #'test-permutation)),
  :tracked true,
  :line 106,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 193
 {:form c,
  :full-form c,
  :tracked true,
  :line 101,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 241
 {:form
  (clojure.core/fn
   []
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    127
    (clojure.test/test-var #'failing-transaction))),
  :full-form
  (clojure.core/fn
   []
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    127
    (clojure.test/test-var #'failing-transaction))),
  :tracked true,
  :line 127,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 226
 {:form (clojure.test/test-var #'test-fully-covered-cond),
  :full-form
  ((cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    116
    clojure.test/test-var)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    116
    #'test-fully-covered-cond)),
  :tracked true,
  :line 116,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 235
 {:form
  (.
   clojure.lang.Numbers
   (clojure.core/isZero
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     124
     n))),
  :full-form
  (.
   clojure.lang.Numbers
   (clojure.core/isZero
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     124
     n))),
  :tracked true,
  :line 124,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 262
 {:form n,
  :full-form n,
  :tracked true,
  :line 136,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 263
 {:form
  (def
   global-loop-shouldnt-crash
   (clojure.core/fn
    ([]
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      138
      (loop 3))))),
  :full-form
  (def
   global-loop-shouldnt-crash
   (clojure.core/fn
    ([]
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      138
      (loop 3))))),
  :tracked true,
  :line 138,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 40
 {:form '(),
  :full-form '(),
  :tracked true,
  :line 24,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 129
 {:form
  (clojure.core/fn
   []
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    75
    (clojure.test/test-var #'test-fully-covered-multi))),
  :full-form
  (clojure.core/fn
   []
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    75
    (clojure.test/test-var #'test-fully-covered-multi))),
  :tracked true,
  :line 75,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 91
 {:form x,
  :full-form x,
  :tracked true,
  :line 54,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 117
 {:form #'test-mixed-multi,
  :full-form #'test-mixed-multi,
  :tracked true,
  :line 68,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 172
 {:form s,
  :full-form s,
  :tracked true,
  :line 88,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 5},
 108
 {:form Character,
  :full-form Character,
  :tracked true,
  :line 63,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 156
 {:form (s (dec (count s))),
  :full-form
  ((cloverage.instrument/wrapm cloverage.coverage/track-coverage 87 s)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    87
    (dec (count s)))),
  :tracked true,
  :line 87,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 6},
 223
 {:form :nonzero,
  :full-form :nonzero,
  :tracked true,
  :line 112,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 181
 {:form
  (.
   clojure.lang.RT
   (clojure.core/count
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     99
     a))),
  :full-form
  (.
   clojure.lang.RT
   (clojure.core/count
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     99
     a))),
  :tracked true,
  :line 99,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 278
 {:form 2,
  :full-form 2,
  :tracked true,
  :line 149,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 56
 {:form
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
  :tracked true,
  :line 36,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 33
 {:form 40,
  :full-form 40,
  :tracked true,
  :line 21,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 13
 {:form
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
  :tracked true,
  :line 14,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 22
 {:form 40,
  :full-form 40,
  :tracked true,
  :line 17,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 257
 {:form (covered),
  :full-form
  ((cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    133
    covered)),
  :tracked true,
  :line 133,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 168
 {:form s,
  :full-form s,
  :tracked true,
  :line 88,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 5},
 90
 {:form ((fn* [] ())),
  :full-form
  ((cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    53
    (fn* [] ()))),
  :tracked true,
  :line 53,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 237
 {:form
  (throw
   (cloverage.coverage/capture
    238
    (new
     RuntimeException
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      125
      "FAIL TRANSACTION")))),
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
  :tracked true,
  :line 125,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 109
 {:form
  (clojure.core/fn
   [x]
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    63
    (str x))),
  :full-form
  (clojure.core/fn
   [x]
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    63
    (str x))),
  :tracked true,
  :line 63,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 216
 {:form #'test-permutation,
  :full-form #'test-permutation,
  :tracked true,
  :line 106,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 191
 {:form assoc,
  :full-form assoc,
  :tracked true,
  :line 101,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 143
 {:form (vec s),
  :full-form
  ((cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    84
    vec)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    84
    s)),
  :tracked true,
  :line 84,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 3},
 178
 {:form
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
  :tracked true,
  :line 96,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 247
 {:form 2,
  :full-form 2,
  :tracked true,
  :line 130,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 167
 {:form subvec,
  :full-form subvec,
  :tracked true,
  :line 88,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 5},
 36
 {:form 4,
  :full-form 4,
  :tracked true,
  :line 22,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 41
 {:form
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
  :tracked true,
  :line 28,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 187
 {:form
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
  :tracked true,
  :line 99,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 195
 {:form (m c 0),
  :full-form
  ((cloverage.instrument/wrapm cloverage.coverage/track-coverage 101 m)
   (cloverage.instrument/wrapm cloverage.coverage/track-coverage 101 c)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    101
    0)),
  :tracked true,
  :line 101,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 118
 {:form
  (defmulti
   fully-covered-multi
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    72
    type)),
  :full-form
  (defmulti
   fully-covered-multi
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    72
    type)),
  :tracked true,
  :line 72,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 150
 {:form s,
  :full-form s,
  :tracked true,
  :line 85,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 8},
 238
 {:form
  (new
   RuntimeException
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    125
    "FAIL TRANSACTION")),
  :full-form
  (new
   RuntimeException
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    125
    "FAIL TRANSACTION")),
  :tracked true,
  :line 125,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 196
 {:form m,
  :full-form m,
  :tracked true,
  :line 101,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 162
 {:form and__5579__auto__,
  :full-form and__5579__auto__,
  :tracked true,
  :line 87,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 6},
 184
 {:form b,
  :full-form b,
  :tracked true,
  :line 100,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 219
 {:form :zero,
  :full-form :zero,
  :tracked true,
  :line 112,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 89
 {:form
  (do
   (cloverage.coverage/capture
    90
    ((cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      53
      (fn* [] ()))))
   (cloverage.coverage/capture 91 x)),
  :full-form
  (do
   (cloverage.coverage/capture
    90
    ((cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      53
      (fn* [] ()))))
   (cloverage.coverage/capture 91 x)),
  :tracked true,
  :line 53,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 100
 {:form 1,
  :full-form 1,
  :tracked true,
  :line 59,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 243
 {:form clojure.test/test-var,
  :full-form clojure.test/test-var,
  :tracked true,
  :line 127,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 131
 {:form clojure.test/test-var,
  :full-form clojure.test/test-var,
  :tracked true,
  :line 75,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 122
 {:form
  (clojure.core/fn
   [x]
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    73
    x)),
  :full-form
  (clojure.core/fn
   [x]
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    73
    x)),
  :tracked true,
  :line 73,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 43
 {:form 2,
  :full-form 2,
  :tracked true,
  :line 31,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 231
 {:form
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
  :tracked true,
  :line 122,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 61
 {:form
  (def
   test-partially-covered
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    38
    (clojure.core/fn
     []
     (clojure.test/test-var #'test-partially-covered)))),
  :full-form
  (def
   test-partially-covered
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    38
    (clojure.core/fn
     []
     (clojure.test/test-var #'test-partially-covered)))),
  :tracked true,
  :line 38,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 29
 {:form b,
  :full-form b,
  :tracked true,
  :line 19,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 151
 {:form 1,
  :full-form 1,
  :tracked true,
  :line 85,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 8},
 44
 {:form 3,
  :full-form 3,
  :tracked true,
  :line 31,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 258
 {:form covered,
  :full-form covered,
  :tracked true,
  :line 133,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 250
 {:form :and,
  :full-form :and,
  :tracked true,
  :line 131,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 93
 {:form (),
  :full-form (),
  :tracked true,
  :line 53,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 6
 {:form 40,
  :full-form 40,
  :tracked true,
  :line 10,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 111
 {:form str,
  :full-form str,
  :tracked true,
  :line 66,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 28
 {:form a,
  :full-form a,
  :tracked true,
  :line 19,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 134
 {:form
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
  :tracked true,
  :line 83,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 11},
 64
 {:form clojure.test/test-var,
  :full-form clojure.test/test-var,
  :tracked true,
  :line 38,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 189
 {:form
  (fn
   [m c]
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    101
    (assoc m c (inc (m c 0))))),
  :full-form
  (fn
   [m c]
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    101
    (assoc m c (inc (m c 0))))),
  :tracked true,
  :line 101,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 280
 {:form
  (.
   clojure.lang.Numbers
   clojure.core/byte_array
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    152
    (map byte [1 2]))),
  :full-form
  (.
   clojure.lang.Numbers
   clojure.core/byte_array
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    152
    (map byte [1 2]))),
  :tracked true,
  :line 152,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 198
 {:form 0,
  :full-form 0,
  :tracked true,
  :line 101,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 155
 {:form 0,
  :full-form 0,
  :tracked true,
  :line 87,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 6},
 248
 {:form 3,
  :full-form 3,
  :tracked true,
  :line 130,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 285
 {:form 1,
  :full-form 1,
  :tracked true,
  :line 152,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 227
 {:form clojure.test/test-var,
  :full-form clojure.test/test-var,
  :tracked true,
  :line 116,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 220
 {:form
  (if
   :else
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    112
    :nonzero)
   (clojure.core/cond)),
  :full-form
  (if
   :else
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    112
    :nonzero)
   (clojure.core/cond)),
  :tracked true,
  :line 112,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 103
 {:form 2,
  :full-form 2,
  :tracked true,
  :line 60,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 170
 {:form
  (.
   clojure.lang.Numbers
   (dec
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     88
     (count s)))),
  :full-form
  (.
   clojure.lang.Numbers
   (dec
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     88
     (count s)))),
  :tracked true,
  :line 88,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 5},
 51
 {:form
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
  :tracked true,
  :line 36,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 25
 {:form 3,
  :full-form 3,
  :tracked true,
  :line 18,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 261
 {:form n,
  :full-form n,
  :tracked true,
  :line 136,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 201
 {:form add-occurrence,
  :full-form add-occurrence,
  :tracked true,
  :line 102,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 166
 {:form (subvec s 1 (dec (count s))),
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
  :tracked true,
  :line 88,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 5},
 34
 {:form 2,
  :full-form 2,
  :tracked true,
  :line 21,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 252
 {:form ({:preimage :image} :preimage),
  :full-form
  ((cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    132
    {:preimage :image})
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    132
    :preimage)),
  :tracked true,
  :line 132,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 146
 {:form true,
  :full-form true,
  :tracked true,
  :line 85,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 2},
 228
 {:form #'test-fully-covered-cond,
  :full-form #'test-fully-covered-cond,
  :tracked true,
  :line 116,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 125
 {:form :default,
  :full-form :default,
  :tracked true,
  :line 74,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 276
 {:form (letfn 2),
  :full-form
  ((cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    149
    letfn)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    149
    2)),
  :tracked true,
  :line 149,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 148
 {:form
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
  :tracked true,
  :line 85,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 8},
 17
 {:form
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
  :tracked true,
  :line 15,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 3
 {:form +,
  :full-form +,
  :tracked true,
  :line 8,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 286
 {:form 2,
  :full-form 2,
  :tracked true,
  :line 152,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 279
 {:form
  (def
   inline-use
   (clojure.core/fn
    ([]
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      151
      (bytes (byte-array (map byte [1 2]))))))),
  :full-form
  (def
   inline-use
   (clojure.core/fn
    ([]
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      151
      (bytes (byte-array (map byte [1 2]))))))),
  :tracked true,
  :line 151,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 12
 {:form 3,
  :full-form 3,
  :tracked true,
  :line 12,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 152
 {:form
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
  :tracked true,
  :line 87,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 6},
 2
 {:form (+ 40),
  :full-form
  ((cloverage.instrument/wrapm cloverage.coverage/track-coverage 8 +)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    8
    40)),
  :tracked true,
  :line 8,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 66
 {:form
  (def
   fully-covered
   (clojure.core/fn
    ([cnd]
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      41
      (if cnd (+ 1 2 3) (- 4 5 6)))))),
  :full-form
  (def
   fully-covered
   (clojure.core/fn
    ([cnd]
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      41
      (if cnd (+ 1 2 3) (- 4 5 6)))))),
  :tracked true,
  :line 41,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 236
 {:form n,
  :full-form n,
  :tracked true,
  :line 124,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 142
 {:form palindrome?,
  :full-form palindrome?,
  :tracked true,
  :line 84,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 3},
 107
 {:form
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
  :tracked true,
  :line 63,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 23
 {:form 2,
  :full-form 2,
  :tracked true,
  :line 17,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 230
 {:form
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
  :tracked true,
  :line 122,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 47
 {:form 3,
  :full-form 3,
  :tracked true,
  :line 32,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 180
 {:form
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
  :tracked true,
  :line 99,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 158
 {:form
  (.
   clojure.lang.Numbers
   (dec
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     87
     (count s)))),
  :full-form
  (.
   clojure.lang.Numbers
   (dec
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     87
     (count s)))),
  :tracked true,
  :line 87,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 6},
 35
 {:form
  (.
   clojure.lang.Numbers
   (divide
    (cloverage.instrument/wrapm cloverage.coverage/track-coverage 22 4)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     22
     2))),
  :full-form
  (.
   clojure.lang.Numbers
   (divide
    (cloverage.instrument/wrapm cloverage.coverage/track-coverage 22 4)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     22
     2))),
  :tracked true,
  :line 22,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 127
 {:form x,
  :full-form x,
  :tracked true,
  :line 74,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 82
 {:form clojure.test/test-var,
  :full-form clojure.test/test-var,
  :tracked true,
  :line 44,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 76
 {:form 4,
  :full-form 4,
  :tracked true,
  :line 42,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 215
 {:form clojure.test/test-var,
  :full-form clojure.test/test-var,
  :tracked true,
  :line 106,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 97
 {:form
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
  :tracked true,
  :line 59,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 277
 {:form letfn,
  :full-form letfn,
  :tracked true,
  :line 149,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 19
 {:form 3,
  :full-form 3,
  :tracked true,
  :line 15,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 57
 {:form
  (.
   clojure.lang.Numbers
   (minus
    (cloverage.instrument/wrapm cloverage.coverage/track-coverage 36 2)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     36
     3))),
  :full-form
  (.
   clojure.lang.Numbers
   (minus
    (cloverage.instrument/wrapm cloverage.coverage/track-coverage 36 2)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     36
     3))),
  :tracked true,
  :line 36,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 202
 {:form {},
  :full-form {},
  :tracked true,
  :line 102,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 68
 {:form cnd,
  :full-form cnd,
  :tracked true,
  :line 42,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 2},
 200
 {:form reduce,
  :full-form reduce,
  :tracked true,
  :line 102,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 11
 {:form 2,
  :full-form 2,
  :tracked true,
  :line 12,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 115
 {:form (clojure.test/test-var #'test-mixed-multi),
  :full-form
  ((cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    68
    clojure.test/test-var)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    68
    #'test-mixed-multi)),
  :tracked true,
  :line 68,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 255
 {:form :image,
  :full-form :image,
  :tracked true,
  :line 132,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 9
 {:form str,
  :full-form str,
  :tracked true,
  :line 12,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 145
 {:form s,
  :full-form s,
  :tracked true,
  :line 84,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 3},
 5
 {:form
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
  :tracked true,
  :line 10,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 244
 {:form #'failing-transaction,
  :full-form #'failing-transaction,
  :tracked true,
  :line 127,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 289
 {:form (clojure.test/test-var #'CLJ-1330-workaround),
  :full-form
  ((cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    154
    clojure.test/test-var)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    154
    #'CLJ-1330-workaround)),
  :tracked true,
  :line 154,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 112
 {:form x,
  :full-form x,
  :tracked true,
  :line 66,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 179
 {:form
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
  :tracked true,
  :line 99,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 245
 {:form
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
  :tracked true,
  :line 130,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 266
 {:form 3,
  :full-form 3,
  :tracked true,
  :line 139,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 254
 {:form :preimage,
  :full-form :preimage,
  :tracked true,
  :line 132,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 283
 {:form byte,
  :full-form byte,
  :tracked true,
  :line 152,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 83
 {:form #'test-fully-covered,
  :full-form #'test-fully-covered,
  :tracked true,
  :line 44,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 138
 {:form clojure.core/not,
  :full-form clojure.core/not,
  :tracked true,
  :line 83,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 11},
 14
 {:form
  (.
   clojure.lang.Numbers
   (multiply
    (cloverage.instrument/wrapm cloverage.coverage/track-coverage 14 2)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     14
     3))),
  :full-form
  (.
   clojure.lang.Numbers
   (multiply
    (cloverage.instrument/wrapm cloverage.coverage/track-coverage 14 2)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     14
     3))),
  :tracked true,
  :line 14,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 265
 {:form loop,
  :full-form loop,
  :tracked true,
  :line 139,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 45
 {:form
  (.
   clojure.lang.Numbers
   (minus
    (cloverage.instrument/wrapm cloverage.coverage/track-coverage 32 2)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     32
     3))),
  :full-form
  (.
   clojure.lang.Numbers
   (minus
    (cloverage.instrument/wrapm cloverage.coverage/track-coverage 32 2)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     32
     3))),
  :tracked true,
  :line 32,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 53
 {:form 1,
  :full-form 1,
  :tracked true,
  :line 36,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 78
 {:form 6,
  :full-form 6,
  :tracked true,
  :line 42,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 132
 {:form #'test-fully-covered-multi,
  :full-form #'test-fully-covered-multi,
  :tracked true,
  :line 75,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 26
 {:form 4,
  :full-form 4,
  :tracked true,
  :line 18,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 123
 {:form x,
  :full-form x,
  :tracked true,
  :line 73,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 203
 {:form a,
  :full-form a,
  :tracked true,
  :line 102,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 140
 {:form vector?,
  :full-form vector?,
  :tracked true,
  :line 83,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 11},
 268
 {:form true,
  :full-form true,
  :tracked true,
  :line 143,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 16
 {:form 3,
  :full-form 3,
  :tracked true,
  :line 14,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 133
 {:form
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
  :tracked true,
  :line 79,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 288
 {:form
  (clojure.core/fn
   []
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    154
    (clojure.test/test-var #'CLJ-1330-workaround))),
  :full-form
  (clojure.core/fn
   []
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    154
    (clojure.test/test-var #'CLJ-1330-workaround))),
  :tracked true,
  :line 154,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 163
 {:form (palindrome? (subvec s 1 (dec (count s)))),
  :full-form
  ((cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    87
    palindrome?)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    87
    (subvec s 1 (dec (count s))))),
  :tracked true,
  :line 87,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 5},
 81
 {:form (clojure.test/test-var #'test-fully-covered),
  :full-form
  ((cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    44
    clojure.test/test-var)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    44
    #'test-fully-covered)),
  :tracked true,
  :line 44,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 120
 {:form
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
  :tracked true,
  :line 73,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 79
 {:form
  (def
   test-fully-covered
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    44
    (clojure.core/fn
     []
     (clojure.test/test-var #'test-fully-covered)))),
  :full-form
  (def
   test-fully-covered
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    44
    (clojure.core/fn
     []
     (clojure.test/test-var #'test-fully-covered)))),
  :tracked true,
  :line 44,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 211
 {:form b-counts,
  :full-form b-counts,
  :tracked true,
  :line 104,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 38
 {:form "two",
  :full-form "two",
  :tracked true,
  :line 21,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 173
 {:form
  (def
   test-palindrome
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    90
    (clojure.core/fn [] (clojure.test/test-var #'test-palindrome)))),
  :full-form
  (def
   test-palindrome
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    90
    (clojure.core/fn [] (clojure.test/test-var #'test-palindrome)))),
  :tracked true,
  :line 90,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 126
 {:form
  (clojure.core/fn
   [x]
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    74
    x)),
  :full-form
  (clojure.core/fn
   [x]
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    74
    x)),
  :tracked true,
  :line 74,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 98
 {:form
  (.
   clojure.lang.Util
   clojure.core/equiv
   (cloverage.instrument/wrapm cloverage.coverage/track-coverage 59 x)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    59
    1)),
  :full-form
  (.
   clojure.lang.Util
   clojure.core/equiv
   (cloverage.instrument/wrapm cloverage.coverage/track-coverage 59 x)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    59
    1)),
  :tracked true,
  :line 59,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 124
 {:form
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
  :tracked true,
  :line 74,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 171
 {:form
  (.
   clojure.lang.RT
   (clojure.core/count
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     88
     s))),
  :full-form
  (.
   clojure.lang.RT
   (clojure.core/count
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     88
     s))),
  :tracked true,
  :line 88,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 5},
 87
 {:form String,
  :full-form String,
  :tracked true,
  :line 50,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 169
 {:form 1,
  :full-form 1,
  :tracked true,
  :line 88,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 5},
 160
 {:form s,
  :full-form s,
  :tracked true,
  :line 87,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 6},
 30
 {:form
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
  :tracked true,
  :line 21,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 207
 {:form {},
  :full-form {},
  :tracked true,
  :line 103,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 194
 {:form
  (.
   clojure.lang.Numbers
   (inc
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     101
     (m c 0)))),
  :full-form
  (.
   clojure.lang.Numbers
   (inc
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     101
     (m c 0)))),
  :tracked true,
  :line 101,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 73
 {:form 3,
  :full-form 3,
  :tracked true,
  :line 42,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 96
 {:form
  (clojure.core/fn
   [x]
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    56
    (if (= x 1) (+ x 2) (- x 2)))),
  :full-form
  (clojure.core/fn
   [x]
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    56
    (if (= x 1) (+ x 2) (- x 2)))),
  :tracked true,
  :line 56,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 10
 {:form 1,
  :full-form 1,
  :tracked true,
  :line 12,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 272
 {:form
  (fn*
   [p1__9825#]
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    148
    (+ p1__9825# 42))),
  :full-form
  (fn*
   [p1__9825#]
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    148
    (+ p1__9825# 42))),
  :tracked true,
  :line 148,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 270
 {:form
  (def
   locals-dont-crash
   (clojure.core/fn
    ([]
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      147
      (let [letfn (fn* [p1__9825#] (+ p1__9825# 42))] (letfn 2)))))),
  :full-form
  (def
   locals-dont-crash
   (clojure.core/fn
    ([]
     (cloverage.instrument/wrapm
      cloverage.coverage/track-coverage
      147
      (let [letfn (fn* [p1__9825#] (+ p1__9825# 42))] (letfn 2)))))),
  :tracked true,
  :line 147,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 271
 {:form
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
  :tracked true,
  :line 148,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 18
 {:form 12,
  :full-form 12,
  :tracked true,
  :line 15,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 105
 {:form x,
  :full-form x,
  :tracked true,
  :line 61,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 185
 {:form
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
  :tracked true,
  :line 99,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 52
 {:form
  (.
   clojure.lang.Numbers
   (add
    (cloverage.instrument/wrapm cloverage.coverage/track-coverage 36 1)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     36
     2))),
  :full-form
  (.
   clojure.lang.Numbers
   (add
    (cloverage.instrument/wrapm cloverage.coverage/track-coverage 36 1)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     36
     2))),
  :tracked true,
  :line 36,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 114
 {:form
  (clojure.core/fn
   []
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    68
    (clojure.test/test-var #'test-mixed-multi))),
  :full-form
  (clojure.core/fn
   []
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    68
    (clojure.test/test-var #'test-mixed-multi))),
  :tracked true,
  :line 68,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 253
 {:form
  {(cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    132
    :preimage)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    132
    :image)},
  :full-form
  {(cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    132
    :preimage)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    132
    :image)},
  :tracked true,
  :line 132,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 209
 {:form
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
  :tracked true,
  :line 104,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 147
 {:form
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
  :tracked true,
  :line 87,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 6},
 67
 {:form
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
  :tracked true,
  :line 42,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 2},
 161
 {:form
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
  :tracked true,
  :line 87,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 6},
 71
 {:form 1,
  :full-form 1,
  :tracked true,
  :line 42,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 42
 {:form
  (.
   clojure.lang.Numbers
   (add
    (cloverage.instrument/wrapm cloverage.coverage/track-coverage 31 2)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     31
     3))),
  :full-form
  (.
   clojure.lang.Numbers
   (add
    (cloverage.instrument/wrapm cloverage.coverage/track-coverage 31 2)
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     31
     3))),
  :tracked true,
  :line 31,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 80
 {:form
  (clojure.core/fn
   []
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    44
    (clojure.test/test-var #'test-fully-covered))),
  :full-form
  (clojure.core/fn
   []
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    44
    (clojure.test/test-var #'test-fully-covered))),
  :tracked true,
  :line 44,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 199
 {:form (reduce add-occurrence {} a),
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
  :tracked true,
  :line 102,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 37
 {:form 2,
  :full-form 2,
  :tracked true,
  :line 22,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 183
 {:form
  (.
   clojure.lang.RT
   (clojure.core/count
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     100
     b))),
  :full-form
  (.
   clojure.lang.RT
   (clojure.core/count
    (cloverage.instrument/wrapm
     cloverage.coverage/track-coverage
     100
     b))),
  :tracked true,
  :line 100,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 63
 {:form (clojure.test/test-var #'test-partially-covered),
  :full-form
  ((cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    38
    clojure.test/test-var)
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    38
    #'test-partially-covered)),
  :tracked true,
  :line 38,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 212
 {:form
  (def
   test-permutation
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    106
    (clojure.core/fn [] (clojure.test/test-var #'test-permutation)))),
  :full-form
  (def
   test-permutation
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    106
    (clojure.core/fn [] (clojure.test/test-var #'test-permutation)))),
  :tracked true,
  :line 106,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 94
 {:form
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
  :tracked true,
  :line 56,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 8
 {:form (str 1 2 3),
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
  :tracked true,
  :line 12,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 246
 {:form
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
  :tracked true,
  :line 130,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 190
 {:form (assoc m c (inc (m c 0))),
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
  :tracked true,
  :line 101,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 177
 {:form #'test-palindrome,
  :full-form #'test-palindrome,
  :tracked true,
  :line 90,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 0},
 49
 {:form
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
  :tracked true,
  :line 36,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1},
 84
 {:form
  (defmulti
   mixed-coverage-multi
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    48
    type)),
  :full-form
  (defmulti
   mixed-coverage-multi
   (cloverage.instrument/wrapm
    cloverage.coverage/track-coverage
    48
    type)),
  :tracked true,
  :line 48,
  :lib cloverage.sample.exercise-instrumentation,
  :file "cloverage/sample/exercise_instrumentation.clj",
  :hits 1}}
