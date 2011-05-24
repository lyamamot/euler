(set! *print-length* 10)

; All three digit numbers.
(def threeDigitNums (range 100 1000))

; Return a sequence of a number multiplied by each number in the sequence.
(defn mapnum [n s] (map #(* n %) s))

; Sequence of unique products of all numbers in the given sequence.
(defn prodset [s] (set (mapcat #(mapnum % s) s)))
; (prodset threeDigitNums)
; (map #(* 2 %) threeDigitNums)

; Is the given number a palindrome?
(defn palindrome? [num]
	(= (str num) (apply str (reverse (str num))))
)

(last (sort (filter #(palindrome? %) (prodset threeDigitNums))))