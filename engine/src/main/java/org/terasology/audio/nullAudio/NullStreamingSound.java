/*
 * Copyright 2013 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.terasology.audio.nullAudio;

import org.terasology.asset.AbstractAsset;
import org.terasology.asset.AssetUri;
import org.terasology.audio.StreamingSound;
import org.terasology.audio.StreamingSoundData;

/**
 *
 */
public final class NullStreamingSound extends AbstractAsset<StreamingSoundData> implements StreamingSound {

    private int channels;
    private int sampleRate;

    public NullStreamingSound(AssetUri uri, StreamingSoundData data) {
        super(uri);
        onReload(data);
    }

    @Override
    protected void onReload(StreamingSoundData data) {
        channels = data.getChannels();
        sampleRate = data.getSamplingRate();
        data.dispose();
    }

    @Override
    protected void onDispose() {

    }

    @Override
    public void reset() {
    }

    @Override
    public int getChannels() {
        return channels;
    }

    @Override
    public int getSamplingRate() {
        return sampleRate;
    }

    @Override
    public int getBufferSize() {
        return 0;
    }

    @Override
    public void play() {
    }

    @Override
    public void play(float volume) {
    }
}
