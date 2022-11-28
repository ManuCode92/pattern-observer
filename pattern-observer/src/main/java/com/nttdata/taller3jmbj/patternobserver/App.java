package com.nttdata.taller3jmbj.patternobserver;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * 
 * @author jmbj
 *
 */
public class App {
	public static void main(String[] args) {
		Observable<String> messageSender = Observable.just("Mensaje1", "Mensaje2", "Mensaje3");

		messageSender.subscribe(new Observer<String>() {

			@Override
			public void onSubscribe(Disposable d) {

				System.out.println("Observer 1. subscribed.");
			}

			@Override
			public void onNext(String t) {
				System.out.println("Observer 1. Received." + t);

			}

			@Override
			public void onError(Throwable e) {

				System.out.println("Observer 1. error." + e.getMessage());

			}

			@Override
			public void onComplete() {

				System.out.println("Observer 1. Completed.");

			}
		});

		messageSender.subscribe(new Observer<String>() {

			@Override
			public void onSubscribe(Disposable d) {

				System.out.println("Observer 2. subscribed.");
			}

			@Override
			public void onNext(String t) {
				System.out.println("Observer 2. Received." + t);

			}

			@Override
			public void onError(Throwable e) {

				System.out.println("Observer 2. error." + e.getMessage());

			}

			@Override
			public void onComplete() {

				System.out.println("Observer 2. Completed.");

			}
		});
	}

}
