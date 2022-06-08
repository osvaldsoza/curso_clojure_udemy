(ns curso-clojure-udemy.imc)

(defn- valor-imc
  [peso altura]
  (/ peso (* altura altura)))

(defn indicador-imc
  [peso altura]
  (let [valor-imc (valor-imc peso altura)]
    (if (< valor-imc 18.5)
      :magreza
      (if (< valor-imc 24.9)
        :normal
        (if (< valor-imc 30)
          :sobre-peso
          :obesidade)))))


