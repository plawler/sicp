(defn square [x] (* x x))

(defn sum-of-squares [x y]
  (+ (square x) (square y) ))

(defn f [a]
  (sum-of-squares (+ a 1) (* a 2)))

(defn abs[x]
  (if (< x 0)
    (- x)
    x))

; completed exercise 1.1
