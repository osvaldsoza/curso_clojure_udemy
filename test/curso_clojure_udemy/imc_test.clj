(ns curso-clojure-udemy.imc-test
  (:require [clojure.test :refer :all]
            [curso-clojure-udemy.imc :as i]))


(deftest indicador-imc-test
  (testing "verifica se o indicador do imc = magreza"
    (is (= :magreza (i/indicador-imc 50 1.65))))
  (testing "verifica se o indicador do imc = normal"
    (is (= :normal (i/indicador-imc 51 1.65))))
  (testing "verifica se o indicador do imc = sobre-peso"
    (is (= :sobre-peso (i/indicador-imc 80 1.65))))
  (testing "verifica se o indicador do imc = obesidade"
    (is (= :obesidade (i/indicador-imc 85 1.65))))
  )

