import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-producto-comprado-recientemente`
 *
 * VistaProductoCompradoRecientemente element.
 *
 * @customElement
 * @polymer
 */
class VistaProductoCompradoRecientemente extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-producto-comprado-recientemente';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductoCompradoRecientemente.is, VistaProductoCompradoRecientemente);
