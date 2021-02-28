import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-producto-enviado`
 *
 * VistaProductoEnviado element.
 *
 * @customElement
 * @polymer
 */
class VistaProductoEnviado extends PolymerElement {

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
        return 'vista-producto-enviado';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductoEnviado.is, VistaProductoEnviado);
