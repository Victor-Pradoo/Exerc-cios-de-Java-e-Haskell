
concatenar([]) = []
concatenar(x:xs) = x ++ concatenar(xs) --xs é o restante da lista e estou usando recursão para percorrer a lista

somar([]) = 0
somar(x:xs) = if x mod 2 /= 0 then let   somar(xs)

--contem:: Num a => [a] -> a -> Bool
--contem [] _ = False
--contem (x:xs) b | (x == b) = True
  --              | otherwise = contem xs b

divisores :: Int -> [Int]
divisores n = [x | x <- [1 .. n], n `mod` x == 0]




main = do
      putStrLn "hello"
