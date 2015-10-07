#ghc opt. v.s. bangs

In simpler samples, ghc optimization can plug the thunk leak. 
For more complex ones like monad, thread, tick, recurse, opt.
cannot figure out how to deal with the leak but partially 
alleviate the leak in some cases. In all cases, adding bang
is able to fully resolve the thunk leak. 

In the list below, every link contains the profile for: 
1. code w/o opt
2. code w/ opt
3. code w/ bangs

  - fib: -O1 plugs space leak
  - length: -O1 plugs space leak
  - monad: -O2/Odph plus space leak in part, but still leaks
      significantly. opt. wasn't able to figure out bangs in
      monad
  - recurse: -O2/Odph barely helped
  - sumacc: -O fixes the leak
  - thread: -O/O2/Odph helps a lot, but code still leaks
  - tick: -O2 barely helped

Conclusion: only in trivial cases does ghc optimization fix
  thunk leaks. 

