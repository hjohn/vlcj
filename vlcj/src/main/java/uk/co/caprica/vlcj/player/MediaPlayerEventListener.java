/*
 * This file is part of VLCJ.
 *
 * VLCJ is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * VLCJ is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with VLCJ.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * Copyright 2009, 2010 Caprica Software Limited.
 */

package uk.co.caprica.vlcj.player;

public interface MediaPlayerEventListener {

  void playing(MediaPlayer mediaPlayer);

  void paused(MediaPlayer mediaPlayer);

  void stopped(MediaPlayer mediaPlayer);

  void finished(MediaPlayer mediaPlayer);
  
  void metaDataAvailable(MediaPlayer mediaPlayer, VideoMetaData videoMetaData);

  void timeChanged(MediaPlayer mediaPlayer, long newTime);

  void positionChanged(MediaPlayer mediaPlayer, float newPosition);

  void lengthChanged(MediaPlayer mediaPlayer, long newLength);
}
