; Find max divisor, which by definition, will be prime.
; Keep dividing number by 2 - infinity until the divisor and the number are equal.
(defn max-divisor [num]
	(loop [n num div 2]
		(if (zero? (rem n div))
			(if (== n div)
				div (recur (/ n div) 2))
			(recur n (inc div))))
)

; Compute primes until num/2. Iterate in reverse order until num % prime is zero.