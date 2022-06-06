(ns curso-clojure-udemy.funcao-anonima)

(fn [x] (* 2 x))

(fn [x y] (+ x y))

#(* 2 %)

#(* % %)

#(+ %1 %2)
