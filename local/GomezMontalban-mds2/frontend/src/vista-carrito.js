import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-carrito`
 *
 * VistaCarrito element.
 *
 * @customElement
 * @polymer
 */
class VistaCarrito extends PolymerElement {

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
        return 'vista-carrito';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCarrito.is, VistaCarrito);
